package org.example;

import org.example.reCapDemo_Classes.DortIslem;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);


        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{3,4,5};
        numbers2 = numbers1;
        numbers1[0]=10;
        System.out.println(numbers2[0]);
    }
}
