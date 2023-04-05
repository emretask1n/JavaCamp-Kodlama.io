package org.example.log;

public class ConsoleLogger implements BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Console log : " + message);
    }
}
