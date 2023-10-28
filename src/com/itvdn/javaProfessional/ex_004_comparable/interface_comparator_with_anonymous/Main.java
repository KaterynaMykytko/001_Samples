package com.itvdn.javaProfessional.ex_004_comparable.interface_comparator_with_anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(140, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                int temp = o1.speed - o2.speed;
                if (temp == 0) {
                    temp = o1.price - o2.price;
                    if (temp == 0) {
                        temp = o1.model.compareTo(o2.model);
                        if(temp == 0){
                            temp = o1.color.compareTo(o2.color);
                        }
                    }
                }
                return temp;
            }
        });
        for (Car temp : c) {
            System.out.println(temp);
        }
        System.out.println();
    }
}
