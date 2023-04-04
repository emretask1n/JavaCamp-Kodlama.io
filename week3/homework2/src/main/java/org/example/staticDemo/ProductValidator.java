package org.example.staticDemo;

public class ProductValidator {
    public static boolean isValid(Product product){
        return product.getPrice() > 0 && !product.getName().isEmpty();
    }
}
