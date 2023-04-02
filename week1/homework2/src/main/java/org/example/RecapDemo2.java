package org.example;

public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2,2.3,3.1,4.4,5.1};
        double sum = 0;
        double maxDouble = myList[1];
        for ( double number : myList) {
            sum += number;
            System.out.println(number);
            if (number > maxDouble){
                maxDouble = number ;
            }
        }
        System.out.println("Summary of list is : " + sum);
        System.out.println("Max double is : "+ maxDouble);
    }
}
