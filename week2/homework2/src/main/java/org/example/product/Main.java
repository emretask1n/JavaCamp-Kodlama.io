package org.example.product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setDescription("LAPTOP");
        product.setName("APPLE");
        product.setPrice(10000);
        product.setStockAmount(3);
        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
