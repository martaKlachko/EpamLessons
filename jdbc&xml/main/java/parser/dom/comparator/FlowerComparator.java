package parser.dom.comparator;

import parser.dom.model.Flower;

import java.util.Comparator;

public class FlowerComparator implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        return Integer.compare(o1.getFlowerNo(), o2.getFlowerNo());
    }
}