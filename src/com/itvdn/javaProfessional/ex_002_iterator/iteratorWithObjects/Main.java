package com.itvdn.javaProfessional.ex_002_iterator.iteratorWithObjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<>();

        al.add(new Car(3000));
        al.add(new Car(3500));

        Iterator<Car> carIterator = al.iterator();
        while (carIterator.hasNext()) {
            Car temp = carIterator.next();
            temp.price++;
        }
        System.out.println(al);
    }
}

class Car {
    int price;

    Car(int price) {
        this.price = price;
    }

    public String toString() {
        return "" + this.price;
    }
}
