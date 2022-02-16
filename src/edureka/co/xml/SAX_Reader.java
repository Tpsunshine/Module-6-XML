package edureka.co.xml;

import java.io.FileInputStream;

import javax.naming.directory.Attributes;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

public class SAX_Reader extends DefaultHandler 
{
	public void startDocument()
	{
		System.out.println("Document begins here");
	}
	
	public void startElement(String uri, String localName,String qName,Attributes attrs)
	{
		System.out.println("<" +qName + ">");
	}
	
	public void charaters(char ch[], int start, int len)
	{
		System.out.println(new String(ch,start,len));
	}
	
	public void endElement(String uri, String localName, String qName)
	{
		System.out.println("</"+qName+ ">");
	}
	
	public void endDocument()
	{
		System.out.println("Document ends here");
	}
	
	public static void main(String [] args) throws Exception
	{
		SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		p.parse(new FileInputStream("c:/"),new SAX_Reader());
	}

}
