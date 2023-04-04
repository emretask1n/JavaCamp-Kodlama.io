package org.example.polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(), new EmailLogger(), new BaseLogger(), new ConsoleLogger()};

        for (BaseLogger logger: loggers){
            logger.log("Log");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
