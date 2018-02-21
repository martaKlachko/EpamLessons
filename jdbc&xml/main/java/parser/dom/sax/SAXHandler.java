package parser.dom.sax;

import parser.dom.model.Flower;
import parser.dom.model.GrowingTip;
import parser.dom.model.VisualParameter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {

    private List<Flower> flowerList = new ArrayList<>();
    private Flower flower = null;
    private VisualParameter visualParameter = null;
    private GrowingTip growingTip = null;

    private boolean bName = false;
    private boolean bSoil = false;
    private boolean bOrigin = false;
    private boolean bVisParam = false;
    private boolean bStem = false;
    private boolean bLeaf = false;
    private boolean bSize = false;
    private boolean bTips = false;
    private boolean bTemp = false;
    private boolean bLight = false;
    private boolean bWater = false;
    private boolean bMultiply = false;

    private boolean bNumber = false;
    private boolean bFlower = false;

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("flower")) {
            String flowerN = attributes.getValue("flowerNo");
            flower = new Flower();
            flower.setFlowerNo(Integer.parseInt(flowerN));
        } else if (qName.equalsIgnoreCase("name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("soil")) {
            bSoil = true;
        } else if (qName.equalsIgnoreCase("origin")) {
            bOrigin = true;
        } else if (qName.equalsIgnoreCase("visual_parameters")) {
            bVisParam = true;
        } else if (qName.equalsIgnoreCase("stam")) {
            bStem = true;
        } else if (qName.equalsIgnoreCase("leaf_color")) {
            bLeaf = true;
        } else if (qName.equalsIgnoreCase("size")) {
            bSize = true;
        } else if (qName.equalsIgnoreCase("growing_tip")) {
            bTips = true;
        } else if (qName.equalsIgnoreCase("temperature")) {
            bTemp = true;
        } else if (qName.equalsIgnoreCase("lighting")) {
            bLight = true;
        } else if (qName.equalsIgnoreCase("watering")) {
            bWater = true;
        } else if (qName.equalsIgnoreCase("multiplying")) {
            bMultiply = true;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("flower")) {
            flowerList.add(flower);
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        if (bName) {
            flower.setName(new String(ch, start, length));
            bName = false;
        } else if (bSoil) {
            flower.setSoil(new String(ch, start, length));
            bSoil = false;
        } else if (bOrigin) {
            flower.setOrigin(new String(ch, start, length));
            bOrigin = false;
        } else if (bVisParam) {
            visualParameter = new VisualParameter();
            bVisParam = false;
        } else if (bStem) {
            String stem = new String(ch, start, length);
            visualParameter.setStam(stem);
            bStem = false;
        } else if (bLeaf) {
            String leaf = new String(ch, start, length);
            visualParameter.setLeafColor(leaf);
            bLeaf = false;
        } else if (bSize) {
            int size = Integer.parseInt(new String(ch, start, length));
            visualParameter.setSize(size);
            bSize = false;
        } else if (bTips) {
            growingTip = new GrowingTip();
            bTips = false;
        } else if (bTemp) {
            double temperature = Double.parseDouble(new String(ch, start, length));
            growingTip.setTemperature(temperature);
            bTemp = false;
        } else if (bLight) {
            boolean lighting = Boolean.parseBoolean(new String(ch, start, length));
            growingTip.setLighting(lighting);
            bLight = false;
        } else if (bWater) {
            double watering = Double.parseDouble((new String(ch, start, length)));
            growingTip.setWatering(watering);
            bWater = false;
        } else if (bMultiply) {
            flower.setVisualParameter(visualParameter);
            flower.setGrowingTip(growingTip);
            flower.setMultiplying(new String(ch, start, length));
            bMultiply = false;
        }
    }
}