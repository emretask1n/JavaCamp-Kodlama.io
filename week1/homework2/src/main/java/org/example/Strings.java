package org.example;

public class Strings {
    public static void main(String[] args) {
        String message = "Today is a beautiful day!";
        System.out.println(message);

        System.out.println("Char number of message : "+ message.length());
        System.out.println("5th char is char at index 4 : " + message.charAt(4));
        System.out.println(message.concat(" Love it!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.startsWith("t"));
        System.out.println(message.endsWith("!"));
        char[] chars = new char[5];
        message.getChars(0,5,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf("ay"));
        System.out.println(message.lastIndexOf("ay"));

        System.out.println("------------------ 2nd Video--------------");
        System.out.println(message.replace(" ", ""));
        System.out.println(message.substring(8));
        System.out.println(message.substring(8,10));

        for(String word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
