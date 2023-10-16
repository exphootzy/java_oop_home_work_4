package org.example;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fructs;

    private int numId;

    private static int counter = 100;

    public Box() {
        this.numId = counter++;
        this.fructs = new ArrayList<T>();
    }

    public void add(T fruit) {fructs.add((T) fruit);}

    @Override
    public String toString() {
        return "Box{" +
                "fructs=" + fructs +
                ", numId=" + numId +
                '}';
    }


    public float getBoxWeight() {
        if (fructs.size() == 0) return 0;
        float weight = 0;
        for (T fruct : fructs) {
            weight += fruct.getWeight();
        }
        return weight;
    }



    public boolean compare(Box box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void moveFruit(Box<T> box) {
        box.fructs.addAll(this.fructs);
        this.fructs.clear();
        System.out.printf("Fruit are moveded from box with numId %d to box with numId %d\n", this.numId, box.numId);
    }

}
