package org.example.abstractDemo;

public class MysqlDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySQL");
    }
}
