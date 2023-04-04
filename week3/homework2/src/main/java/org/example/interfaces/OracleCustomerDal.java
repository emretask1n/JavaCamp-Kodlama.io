package org.example.interfaces;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }
}
