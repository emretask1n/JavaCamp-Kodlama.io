package org.example;

public class PerfectNumbers {
    public static void main(String[] args) {
        printPerfectNumber(6);
    }

    static void printPerfectNumber(int number){

        if (number <= 0) {
            System.out.println("Not a valid number!");
        }

        int divisors = 0;

        for(int i=1;i<number/2;i++){
            if(number%i==0){
                divisors +=i;
            }
        }

        if(divisors==number){
            System.out.println("This is a perfect number!");
        }else{
            System.out.println("Not a perfect number!");
        }
    }
}
