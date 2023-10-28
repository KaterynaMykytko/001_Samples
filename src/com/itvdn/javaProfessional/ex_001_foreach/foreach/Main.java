package com.itvdn.javaProfessional.ex_001_foreach.foreach;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 5000);
        Car c2 = new Car("Mercedes", 4000);
        Car c3 = new Car("Mazda", 3000);
        Car[] c = {c1, c2, c3};
        for (Car temp : c) {
            temp.price = temp.price + 500;    // Можлива зміна полів об'єкта
//            temp = new Car("Opel", 2000);     // Не можна міняти об'єкти в масиві
        }
        for (Car temp : c) {
            System.out.println(temp.model + " " + temp.price);
        }
    }
}
