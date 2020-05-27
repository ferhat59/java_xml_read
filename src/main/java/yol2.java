import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class yol2{

    public static void main(String[] args) {
        String xmlDosyasi = "deneme.xml";

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlDosyasi);
            Element kokElement = document.getDocumentElement();
            System.out.println(kokElement.getNodeName());
            NodeList kisiListesi = kokElement.getElementsByTagName("Oyun");
            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                String kisiSira = kisiElement.getElementsByTagName("ID").item(0).getTextContent();
                String kisiAdi = kisiElement.getElementsByTagName("OyunAdi").item(0).getTextContent();
                String kisiSoyadi = kisiElement.getElementsByTagName("Tarih").item(0).getTextContent();
                System.out.println(kisiSira + " " + kisiAdi + " " + kisiSoyadi);
            }
        System.out.println("Hello World!");
    }
     catch (Exception ex) {
        System.err.println(ex);
    }

}}
