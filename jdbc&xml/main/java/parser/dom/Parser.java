package parser.dom;

import parser.dom.comparator.FlowerComparator;
import parser.dom.filechecker.ExtensionChecker;
import parser.dom.model.Flower;
import parser.dom.dom.DOMParserUser;
import parser.dom.sax.SAXParserUser;
import parser.dom.stax.StAXReader;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 21.02.2018.
 */
public class Parser {
    public static void main(String[] args) {

        try {

            File xml = new File("src\\main\\resources\\flowers.xml");
            File xsd = new File("src\\main\\resources\\flowers.xsd");

            File xsl = new File("src\\main\\resources\\flowers.xsl");


            if (checkIfXML(xml) && checkIfXSD(xsd)) {

                // DOM
                printList(DOMParserUser.getFlowerList(xml, xsd), "DOM");

                // StAX
                printList(StAXReader.parseFlowers(xml, xsd), "StAX");

                //SAX
                printList(SAXParserUser.parseFlowers(xml, xsd), "SAX");

            }

            StreamSource xslSource = new StreamSource(xsl);
            StreamSource xmlSource = new StreamSource(xml);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xslSource);
            transformer.transform(xmlSource, new StreamResult(new File("F:\\_EPAM\\flower.html")));

            StreamResult consoleOut = new StreamResult(System.out);
            // Transform the document and print the content to console
            transformer.transform(xmlSource, consoleOut);

        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }


    private static boolean checkIfXSD(File xsd) {
        return ExtensionChecker.isXSD(xsd);
    }

    private static boolean checkIfXML(File xml) {
        return ExtensionChecker.isXML(xml);
    }

    private static void printList(List<Flower> flowers, String parserName) {
        Collections.sort(flowers, new FlowerComparator());
        System.out.println(parserName);

        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
