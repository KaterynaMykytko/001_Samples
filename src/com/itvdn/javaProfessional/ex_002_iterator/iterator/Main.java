package com.itvdn.javaProfessional.ex_002_iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(5);
        al.add(8);

        System.out.println(al);

        // за допомогою ітератора можемо бігати за нашим списком
        Iterator<Integer> iterator = al.iterator();

        // питаємо чи є наступний елемент у списку, якщо true, то буде реалізовано тіло while
        while (iterator.hasNext()) {
            // переходимо до наступного елемента у списку та його виводимо
            Integer temp = iterator.next();
            System.out.println(temp);
        }

        // та ж дія, але через оптимізований ітератор під списки
        ListIterator<Integer> listIterator = al.listIterator();

        while (listIterator.hasNext()) {
            Integer temp = listIterator.next();
            System.out.println(temp);
        }
    }
}
