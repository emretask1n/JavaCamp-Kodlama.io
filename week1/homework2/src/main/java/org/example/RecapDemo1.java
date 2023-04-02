package org.example;

public class RecapDemo1 {
    // find the greatest int
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int number3 = 15;

        //solution
        int greatest = number1;

        if(number2 > greatest){
            greatest = number2;
        }

        if(number3 > greatest){
            greatest = number3;
        }

        System.out.println("The greatest number is : " + greatest);

        // alternative solution

        greatest = Math.max(number1 , Math.max(number2,number3));
        System.out.println("The greatest number is : " + greatest);
    }
}
