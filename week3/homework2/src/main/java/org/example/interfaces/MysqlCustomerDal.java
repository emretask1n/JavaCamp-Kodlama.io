package org.example.interfaces;

public class MysqlCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("MySQL eklendi.");
    }
}
