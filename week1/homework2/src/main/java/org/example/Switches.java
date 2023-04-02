package org.example;

public class Switches {
    public static void main(String[] args) {
        char grade ='A';

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Your grade is : " + grade);
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade!");
        }
    }
}
