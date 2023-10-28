package com.itvdn.javaProfessional.ex_003_sorting.sorting_values;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {7, 8, 9, 3, -10, 43};
        String[] s = {"Alex", "Edward", "Evgeniy", "Karina"};
        Arrays.sort(x);
        Arrays.sort(s);
        for (int temp : x) {
            System.out.print(temp + " ");
        }
        System.out.println();
        for (String temp : s) {
            System.out.print(temp + " ");
        }

//        Car c1 = new Car(190, 8000, "BMW", "Red");
//        Car c2 = new Car(130, 2000, "Tavria", "Black");
//        Car c3 = new Car(185, 10000, "Citroen", "White");
//        Car[] c = {c1, c2, c3};

//        Arrays.sort(c);   // ClassCastException
    }
}
