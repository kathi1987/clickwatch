package de.hub.specificmodels.tests.metamodelgenerator;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

import de.hub.specificmodels.tests.common.AbstractTests;

public class XmlMultiplicitiesTests extends AbstractTests {

	@Test
	public void testMultiplicities0() throws IOException {
		String xmlStr = "<xml><foo/></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "RootClass", null, "xml", null, 1);
		assertClass(result, "Xml", null, "foo", null, 1);
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null, 1);
	}
	
	@Test
	public void testMultiplicities1() throws IOException {
		String xmlStr = "<xml><foo/><foo/><foo/></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "RootClass", null, "xml", null, 1);
		assertClass(result, "Xml", null, "foo", null, -1);
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null, 1);
	}
	
	@Test
	public void testMultiplicities2() throws IOException {
		String xmlStr = "<xml><foo/></xml><xml><foo/></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "foo", null, 1);
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null, 1);
	}
	
	@Test
	public void testMultiplicities3() throws IOException {
		String xmlStr = "<xml><bar><foo/></bar></xml><xml><bar><foo/></bar></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, 1);
		assertClass(result, "Bar", null, "foo", null, 1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities4() throws IOException {
		String xmlStr = "<xml><bar><foo/></bar><bar/></xml><xml><bar><foo/></bar></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, -1);
		assertClass(result, "Bar", null, "foo", null, 1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities5() throws IOException {
		String xmlStr = "<xml><bar><foo/><foo/></bar></xml><xml><bar><foo/></bar></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, 1);
		assertClass(result, "Bar", null, "foo", null, -1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities6() throws IOException {
		String xmlStr = "<xml><bar><foo/><foo/></bar></xml><xml><bar><foo/></bar><bar/></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, -1);
		assertClass(result, "Bar", null, "foo", null, -1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities7() throws IOException {
		String xmlStr = "<xml><bar><foo n='1'/></bar></xml><xml><bar><foo n='1'/></bar></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, 1);
		assertClass(result, "Bar", null, "foo", null, 1);
		assertClass(result, "Foo", null, "n", null, 1);
	}
	
	@Test
	public void testMultiplicities8() throws IOException {
		String xmlStr = "<xml><bar><foo n='1'/></bar></xml><xml><bar><foo n='1'/></bar><bar><foo n='1'/></bar></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, -1);
		assertClass(result, "Bar", null, "foo", null, 1);
		assertClass(result, "Foo", null, "n", null, 1);
	}
	
	@Test
	public void testMultiplicities9() throws IOException {
		String xmlStr = "<xml><bar n='1'></bar></xml><xml><bar n='1'></bar><bar n='1'></bar></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, -1);
		assertClass(result, "Bar", null, "n", null, 1);
	}
	
	@Test
	public void testMultiplicitiesBcast_stats10() throws IOException {
		String xmlStr = "<xml><foo a='str' b='1'/><foo a='str' b='1.3'/></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, 1);
		assertClass(result, "Xml", null, "foo", null, -1);
		
		assertClass(result, "Foo", null, "a", null, 1);
		assertClass(result, "Foo", null, "b", EcorePackage.eINSTANCE.getEDouble(), 1);
	}
	
	@Test
	public void testMultiplicitiesBcast_stats0() throws IOException {
		String xmlStr = ""
+"		<entry from='06-1B-B1-07-CD-95' time='1300193245.206682457' seq='30020' period='100' tau='10000' >\n"
+"		<link to='06-1B-B1-05-3A-FD' seq='30013' period='100' tau='10000' last_rx='1.391808457' >\n"
+"			<link_info size='100' rate='2' fwd='29' rev='20'/>\n"
+"		</link>\n"
+"		</entry>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "entry", null, 1);
		assertClass(result, "Entry", null, "from", null, 1);
		assertClass(result, "Entry", null, "seq", null, 1);
		assertClass(result, "Entry", null, "link", null, 1);
		assertClass(result, "Link", null, "tau", null, 1);
		assertClass(result, "Link", null, "last_rx", null, 1);
		assertClass(result, "Link", null, "link_info", null, 1);
		assertClass(result, "Link_info", null, "size", null, 1);
		assertClass(result, "Link_info", null, "rate", null, 1);
	}
	
	@Test
	public void testMultiplicitiesBcast_stats2() throws IOException {
		String xmlStr = ""
+"		<entry from='06-1B-B1-07-CD-95' time='1300193245.206682457' seq='30020' period='100' tau='10000' >\n"
+"		<link to='06-1B-B1-05-3A-FD' seq='30013' period='100' tau='10000' last_rx='1.391808457' >\n"
+"			<link_info size='100' rate='2' fwd='29' rev='20'/>\n"
+"		</link>\n"
+"		<link to='06-1B-B1-05-3B-75' seq='30034' period='100' tau='10000' last_rx='0.081343457' >\n"
+"			<link_info size='100' rate='2' fwd='94' rev='83'/>\n"
+"		</link>\n"
+"		<link to='06-1B-B1-05-3B-96' seq='30029' period='100' tau='10000' last_rx='0.074071457' >\n"
+"			<link_info size='100' rate='2' fwd='93' rev='98'/>\n"
+"		</link>\n"
+"		<link to='06-1B-B1-05-3B-97' seq='30021' period='100' tau='10000' last_rx='0.044487457' >\n"
+"			<link_info size='100' rate='2' fwd='90' rev='90'/>\n"
+"		</link>\n"
+"		<link to='06-1B-B1-05-3B-A2' seq='30023' period='100' tau='10000' last_rx='0.026669457' >\n"
+"			<link_info size='100' rate='2' fwd='0' rev='80'/>\n"
+"		</link>\n"
+"		<link to='06-1B-B1-05-46-0C' seq='30031' period='100' tau='10000' last_rx='0.089138457' >\n"
+"			<link_info size='100' rate='2' fwd='72' rev='86'/>\n"
+"		</link>\n"
+"		<link to='06-1B-B1-05-46-36' seq='30037' period='100' tau='10000' last_rx='0.063034457' >\n"
+"			<link_info size='100' rate='2' fwd='99' rev='100'/>\n"
+"		</link>\n"
+"		</entry>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "entry", null, 1);
		assertClass(result, "Entry", null, "from", null, 1);
		assertClass(result, "Entry", null, "seq", null, 1);
		assertClass(result, "Entry", null, "link", null, -1);
		assertClass(result, "Link", null, "tau", null, 1);
		assertClass(result, "Link", null, "last_rx", null, 1);
		assertClass(result, "Link", null, "link_info", null, 1);
		assertClass(result, "Link_info", null, "size", null, 1);
		assertClass(result, "Link_info", null, "rate", null, 1);
	}
	
	@Test
	public void testText() throws IOException {
		String xmlStr = "<xml><foo>TEXT</foo></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", "text", null, 1);
	}
	
	@Test
	public void testAttributeMultiplicities() throws IOException {
		String xmlStr = "<xml><foo name='a'/></xml>";
		
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", "name", null, 1);
	}
	
}
