package org.example;

import java.util.ArrayList;

public class Box {

    private ArrayList<T> fructs;

    private int barCode;

    private static int counter = 10050050;

    public Box() {
        this.barCode = counter++;
        this.fructs = new ArrayList<T>();
    }

    public void add(T fruit) {fructs.add((T) fruit);}

    @Override
    public String toString() {
        return "Box{" +
                "fructs=" + fructs +
                ", barCode=" + barCode +
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
        System.out.printf("Fruit are moveded from box with barcode %d to box with barcode %d\n", this.barCode, box.barCode);
    }

}
