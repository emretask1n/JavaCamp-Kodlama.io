package org.example.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product elma = new Product(1,"Elma",10);
        productManager.add(elma);
    }
}
