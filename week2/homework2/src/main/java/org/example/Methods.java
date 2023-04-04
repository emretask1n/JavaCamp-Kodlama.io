package org.example;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String message = "Today is a beautiful day!";
        String newMessage = giveProvince();
        System.out.println(newMessage);
        int number = topla(15,7);
        int sum = topla2();
        System.out.println(sum);
    }

    public static void ekle(){

    }

    public static void sil(){

    }

    public static void guncelle(){
        System.out.println("Updated");
    }
    public static int topla(int a, int b) {
        return a+b;
    }

    public static int topla2(int... numbers){
        return Arrays.stream(numbers).sum();
    }

    public static String giveProvince(){
        return "Sinop";
    }
}
