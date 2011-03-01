package edu.hu.clickwatch.tests;

import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import edu.hu.clickwatch.ClickWatchStandaloneSetup;
import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.merge.Diff;
import edu.hu.clickwatch.merge.Merge;

public class MergeTests extends TestCase {

	private XmlModelRepository xmlModelRepository;

	@Override
	protected void setUp() throws Exception {
		ClickWatchStandaloneSetup.doSetup();
		xmlModelRepository = new XmlModelRepository();
	}
	
	private EObject performMergeXML(String mergedValueStr, String newValueStr, boolean changing) {
		EObject mergedValue = xmlModelRepository.deserializeXml(mergedValueStr);
		EObject orig = mergedValue;
		EObject newValue = xmlModelRepository.deserializeXml(newValueStr);
		
		boolean result = Merge.merge(mergedValue, newValue, new Diff(null), new Merge.Operations() {			
			@Override
			public void replace() {
				assertFalse(true);
			}
			
			@Override
			public void remove() {
				assertFalse(true);
			}
			
			@Override
			public void add() {
				assertFalse(true);
			}
		});
	
		assertEquals(changing, result);
		assertEquals(orig, mergedValue);
		assertEquals(xmlModelRepository.serializeXml(newValue), xmlModelRepository.serializeXml(mergedValue));
		return mergedValue;
	}
	
	private EObject performMergeXSD(String mergedValueStr, String newValueStr, boolean changing) {
		EPackage metaModel = null;
		try {
			metaModel = xmlModelRepository.loadMetaModelFromXSD(URI.createFileURI(XmlModelRepositoryTest.LINK_STAT_XSD), 
					TestUtil.readFileAsString(XmlModelRepositoryTest.LINK_STAT_XSD));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject mergedValue = xmlModelRepository.deserializeModel(metaModel, mergedValueStr);
		EObject orig = mergedValue;
		EObject newValue = xmlModelRepository.deserializeModel(metaModel, newValueStr);
		
		boolean result = Merge.merge(mergedValue, newValue, new Diff(null), new Merge.Operations() {			
			@Override
			public void replace() {
				assertFalse(true);
			}
			
			@Override
			public void remove() {
				assertFalse(true);
			}
			
			@Override
			public void add() {
				assertFalse(true);
			}
		});
	
		assertEquals(changing, result);
		assertEquals(orig, mergedValue);
		assertEquals(xmlModelRepository.serializeModel(metaModel, newValue), xmlModelRepository.serializeModel(metaModel, mergedValue));
		return mergedValue;
	}
	
	public void testGeneral() {
		performMergeXML("<foo/>", "<foo/>", false);
	}
	
	public void testTexts() {
		performMergeXML("<foo><bar>TEXT</bar></foo>", "<foo><bar>SIP</bar></foo>", true);
		performMergeXML("<foo><bar>TEXT</bar></foo>", "<foo><bar>TEXT</bar></foo>", false);
		performMergeXML("<foo><bar>TEXT</bar></foo>", "<foo><bar>TEXT</bar>TEXT</foo>", true);
	}
	
	public void testAttributes() {
		performMergeXML("<foo attr='ATTR'>TEXT</foo>", "<foo>TEXT</foo>", true);
		performMergeXML("<foo>TEXT</foo>", "<foo attr='ATTR'>TEXT</foo>", true);
		performMergeXML("<foo attr='ATTR'>TEXT</foo>", "<foo attr='ATTR2'>TEXT</foo>", true);
		performMergeXML("<foo attr='ATTR'>TEXT</foo>", "<foo attr='ATTR'>TEXT</foo>", false);
		performMergeXML("<foo attr='ATTR'>TEXT</foo>", "<foo attr='ATTR' attr2='ATTR'>TEXT</foo>", true);
		performMergeXML("<foo attr='ATTR'>TEXT</foo>", "<foo attr='ATTR' attr2='ATTR2'>TEXT</foo>", true);
		performMergeXML("<foo attr='ATTR' attr2='ATTR'>TEXT</foo>", "<foo attr='ATTR' attr2='ATTR'>TEXT</foo>", false);
		performMergeXML("<foo attr='ATTR' attr2='ATTR'>TEXT</foo>", "<foo attr2='ATTR' attr='ATTR'>TEXT</foo>", true);
	}
	
	public void testElements() {
		performMergeXML("<foo><bar/></foo>", "<foo></foo>", true);
		performMergeXML("<foo><bar/></foo>", "<foo><bar/></foo>", false);
		performMergeXML("<foo></foo>", "<foo><bar/></foo>", true);
		performMergeXML("<foo><bar/></foo>", "<foo><bar/><bar/></foo>", true);
		performMergeXML("<foo><bar/></foo>", "<foo><bar/><bar2/></foo>", true);
	}
	
	public void testXSD() {
		performMergeXSD("<entry/>", "<entry/>", false);
	}
	
	public void testXSDObjects() {
		performMergeXSD("<entry/>", "<entry><link/></entry>", true);
		performMergeXSD("<entry/>", "<entry><link/><link/></entry>", true);
		performMergeXSD("<entry><link/></entry>", "<entry><link/><link/></entry>", true);
		performMergeXSD("<entry><link/></entry>", "<entry><link/></entry>", false);
		performMergeXSD("<entry><link/></entry>", "<entry/>", true);
	}
	
	public void testXSDFeatures() {
		performMergeXSD("<entry/>", "<entry seq='16'/>", true);
		performMergeXSD("<entry seq='16'/>", "<entry seq='16'/>", false);
		performMergeXSD("<entry seq='16'/>", "<entry seq='32'/>", true);
		// performMergeXSD("<entry seq='16'/>", "<entry/>", true); fails for technical reasons, i.e. seq is int and empty int is 0 not empty
	}
}
