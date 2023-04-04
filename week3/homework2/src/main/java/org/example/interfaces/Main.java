package org.example.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MysqlCustomerDal());
        customerManager.add();
    }
}
