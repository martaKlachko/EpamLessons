package parser.dom.dom;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import parser.dom.model.Flower;
import parser.dom.model.GrowingTip;
import parser.dom.model.VisualParameter;

import java.util.ArrayList;
import java.util.List;

public class DOMDocReader {
    public List<Flower> readDoc(Document doc) {
        doc.getDocumentElement().normalize();
        List<Flower> flowers = new ArrayList<>();

        NodeList nodeList = doc.getElementsByTagName("flower");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Flower flower = new Flower();
            VisualParameter visualParameter;
            GrowingTip growingTip;

            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                flower.setFlowerNo(Integer.parseInt(element.getAttribute("flowerNo")));
                flower.setName(element.getElementsByTagName("name").item(0).getTextContent());
                flower.setSoil(element.getElementsByTagName("soil").item(0).getTextContent());
                flower.setOrigin(element.getElementsByTagName("origin").item(0).getTextContent());

                visualParameter = getVisualParameters(element.getElementsByTagName("visual_parameters"));
                growingTip = getGrowingTips(element.getElementsByTagName("growing_tips"));

                flower.setVisualParameter(visualParameter);
                flower.setGrowingTip(growingTip);
                flower.setMultiplying(element.getElementsByTagName("multiplying").item(0).getTextContent());

                flowers.add(flower);
            }
        }
        return flowers;
    }

    private VisualParameter getVisualParameters(NodeList nodes) {
        VisualParameter visualParameter = new VisualParameter();
        if (nodes.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodes.item(0);
            visualParameter.setStam(element.getElementsByTagName("stam").item(0).getTextContent());
            visualParameter.setLeafColor(element.getElementsByTagName("leaf_color").item(0).getTextContent());
            visualParameter.setSize(Integer.parseInt(element.getElementsByTagName("size").item(0).getTextContent()));
        }
        return visualParameter;
    }

    private GrowingTip getGrowingTips(NodeList nodes) {
        GrowingTip growingTip = new GrowingTip();
        if (nodes.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodes.item(0);
            growingTip.setTemperature(Double.parseDouble(element.getElementsByTagName("temperature").item(0).getTextContent()));
            growingTip.setLighting(Boolean.parseBoolean(element.getElementsByTagName("lighting").item(0).getTextContent()));
            growingTip.setWatering(Double.parseDouble(element.getElementsByTagName("watering").item(0).getTextContent()));
        }
        return growingTip;
    }
}

