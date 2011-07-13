package de.hub.clickwatch.ui.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EObject;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Binder;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.tests.AbstractTest;
import de.hub.clickwatch.ui.connection.MergingNodeAdapterMergeConfiguration;

@Deprecated
public class MergeWithTimeTestNA extends AbstractTest {
	
	private XmlModelRepository xmlModelRepository;
	private Merger merger;
	
	@Override
	protected void additionalSetUp() {
		merger = injector.getInstance(Merger.class);
		xmlModelRepository = injector.getInstance(XmlModelRepository.class);
	}

	@Override
	protected void configureAnAdditionalModule(Binder binder) {
		binder.bind(IMergeConfiguration.class).to(MergingNodeAdapterMergeConfiguration.class);
	}

	private EObject performMergeCW(String mergedValueStr, String newValueStr, String cmpStr, boolean changedModel) {
		mergedValueStr = "<edu.hu.clickwatch.model:Element xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model' name='1'>\n\t" + mergedValueStr + "\n</edu.hu.clickwatch.model:Element>";
		newValueStr = "<edu.hu.clickwatch.model:Element xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model' name='1'>\n\t" + newValueStr + "\n</edu.hu.clickwatch.model:Element>";
		cmpStr = "<edu.hu.clickwatch.model:Element xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model' name='1'>\n\t" + cmpStr + "\n</edu.hu.clickwatch.model:Element>";
		
		Node mergedNode = ClickWatchModelFactory.eINSTANCE.createNode();
		mergedNode.setRecording(true);		
		EObject mergedValue = xmlModelRepository.deserializeXml(mergedValueStr);
		mergedNode.getElements().add((Element)mergedValue);
		EObject orig = mergedValue;
		
		Node newNode = ClickWatchModelFactory.eINSTANCE.createNode();
		EObject newValue = xmlModelRepository.deserializeXml(newValueStr);
		newNode.getElements().add((Element)newValue);
		
		EObject cmpValue = xmlModelRepository.deserializeXml(cmpStr);
		
//		((MergingNodeAdapterMergeConfiguration)merger.getConfiguration()).setNode(mergedNode);
		boolean result = merger.merge(mergedNode, newNode);
	
		assertEquals(true, result);
		assertEquals(changedModel, !((MergingNodeAdapterMergeConfiguration)merger.getConfiguration()).getChanges().isEmpty());
		assertEquals(orig, mergedValue);
		boolean eEquals = merger.eEquals(mergedValue, cmpValue);
		if (!eEquals) {
			assertEquals(cmpStr, xmlModelRepository.serializeXml(mergedValue));
		} 
		assertTrue(eEquals);
		return mergedValue;
	}
	
	@Ignore("Work in progress or deprecated")  
	@Test
	public void testSimple() {
		performMergeCW(
				"<handler name='a'><A time='1'/></handler>", 
				"<handler name='a'><A time='2'/></handler>",
				"<handler name='a'><A time='1'/><A time='2'/></handler>", true);
		performMergeCW(
				"<handler name='a'/>", 
				"<handler name='a'><A time='1'/><A time='2'/></handler>",
				"<handler name='a'><A time='1'/><A time='2'/></handler>", true);
	}
}
