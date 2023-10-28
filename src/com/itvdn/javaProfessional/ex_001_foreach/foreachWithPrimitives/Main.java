package com.itvdn.javaProfessional.ex_001_foreach.foreachWithPrimitives;

public class Main {
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};

        // Виведення на екран елементів масиву x за допомогою циклу for
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        // Виведення на екран елементів масиву x за допомогою циклу foreach
//        for (int temp : x) {
//            System.out.print(temp + " ");
//        }
//        System.out.println();

        // Зміна значення поля класу
//        for (int temp : x) {
//            ++temp;
//            System.out.print(temp + " ");
//        }
//        System.out.println();

        // Виведення на екран елементів масиву x за допомогою циклу foreach
//        for (int temp : x) {
//            System.out.print(temp + " ");
//        }
    }
}
