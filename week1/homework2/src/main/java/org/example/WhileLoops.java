package org.example;

public class WhileLoops {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While loop is finished");

        //Do-While loop -- Şart sağlanmasa bile son kez çalışıyor
        do{
            System.out.println(i);
            i+=3;
        }while (i<10);
        System.out.println("Do-While loop is finished");
    }
}
