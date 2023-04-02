package org.example;

public class Vowels {
    public static void main(String[] args) {
        checkVowelType('A');
    }

    static void checkVowelType(char character){
        switch (character){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold vowel");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Thin vowel");
                break;
            default:
                System.out.println("Not a vowel!");
        }

    }
}
