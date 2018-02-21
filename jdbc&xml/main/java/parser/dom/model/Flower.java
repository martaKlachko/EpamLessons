package parser.dom.model;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    private int flowerNo;
    private String name;
    private String soil;
    private String origin;
    private VisualParameter visualParameter;
    private GrowingTip growingTip;
    private String multiplying;

    public Flower() {
    }

    public Flower(int flowerNo, String name, String soil, String origin, VisualParameter visualParameter, GrowingTip growingTip, String multiplying) {
        this.flowerNo = flowerNo;
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.visualParameter = visualParameter;
        this.growingTip = growingTip;
        this.multiplying = multiplying;
    }

    public int getFlowerNo() {
        return flowerNo;
    }

    public void setFlowerNo(int flowerNo) {
        this.flowerNo = flowerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParameter getVisualParameter() {
        return visualParameter;
    }

    public void setVisualParameter(VisualParameter visualParameter) {
        this.visualParameter = visualParameter;
    }

    public GrowingTip getGrowingTip() {
        return growingTip;
    }

    public void setGrowingTip(GrowingTip growingTip) {
        this.growingTip = growingTip;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerNo=" + flowerNo +
                ", name='" + name + '\'' +
                ", soil='" + soil + '\'' +
                ", origin='" + origin + '\'' +
                ", visualParameter=" + visualParameter +
                ", growingTip=" + growingTip +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }
}
