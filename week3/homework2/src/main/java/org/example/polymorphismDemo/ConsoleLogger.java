package org.example.polymorphismDemo;

public class ConsoleLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Console log : " + message);
    }
}
