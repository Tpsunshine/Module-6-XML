package edureka.co.xml;

import java.io.FileOutputStream;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;



public class DOM_Write_Employee 
{
	public static void main(String [] args)throws Exception
	{
	
	DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
	DocumentBuilder b = f.newDocumentBuilder();
	Document doc = b.newDocument();
	
	Element rootele = doc.createElement("Employee");
	
	Element employeeele = doc.createElement("employee");
	Element idele = doc.createElement("id");
	Element nameele = doc.createElement("name");
	Element deptele = doc.createElement("Dept");
	
	Text t1 = doc.createTextNode("01");
	Text t2 = doc.createTextNode("Chris");
	Text t3 = doc.createTextNode("R&D");
	
	idele.appendChild(t1);
	employeeele.appendChild(nameele);
	employeeele.appendChild(deptele);
	
	rootele.appendChild(employeeele);
	doc.appendChild(rootele);
	Transformer t = TransformerFactory.newInstance().newTransformer();
	t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("c:/ employee.xml")));
	System.out.println("XML file Generated...");

}
}
