package parser.dom.model;

public class VisualParameter {
    private String color;
    private String stam;
    private String leafColor;
    private int size;

    public VisualParameter() {
    }

    public VisualParameter(String color, String stam, String leafColor, int size) {
        this.color = color;
        this.stam = stam;
        this.leafColor = leafColor;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStam() {
        return stam;
    }

    public void setStam(String stam) {
        this.stam = stam;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "VisualParameters{" +
                "color='" + color + '\'' +
                ", stam='" + stam + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", size=" + size +
                '}';
    }
}

