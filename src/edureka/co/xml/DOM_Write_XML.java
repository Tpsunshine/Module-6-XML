//package xml1;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;

import javax.xml.transform.*;

import javax.xml.transform.dom.*;

import javax.xml.transform.stream.*;

 

public class DOM_Write_XML

{

  public static void main(String args[])throws Exception

  {

      DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();

      DocumentBuilder b=f.newDocumentBuilder();

      Document doc=b.newDocument();

     

      Element rootele=doc.createElement("students");

      Element studentele=doc.createElement("student");

      Element idele=doc.createElement("id");

      Element nameele=doc.createElement("name");

      Element stdele=doc.createElement("std");

      Element genderele=doc.createElement("gender");

      Element marksele=doc.createElement("marks");

      Element addrele=doc.createElement("address");

     

      Text t1=doc.createTextNode("01");

      Text t2=doc.createTextNode("Amit");

      Text t3=doc.createTextNode("M.Tech");

      Text t4=doc.createTextNode("Male");//Document object module parser

      Text t5=doc.createTextNode("100");

      Text t6=doc.createTextNode("California");

     

      idele.appendChild(t1);

      nameele.appendChild(t2);

      stdele.appendChild(t3);

      genderele.appendChild(t4);

      marksele.appendChild(t5);

      addrele.appendChild(t6);

     

      studentele.appendChild(idele);

      studentele.appendChild(nameele);

      studentele.appendChild(stdele);

      studentele.appendChild(genderele);

      studentele.appendChild(marksele);

      studentele.appendChild(addrele);

    

     rootele.appendChild(studentele);

     doc.appendChild(rootele);

     Transformer t=TransformerFactory.newInstance().newTransformer();

     t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("c:/Data Files/students.xml")));

     System.out.println("XML file generated..");

     

  }

}