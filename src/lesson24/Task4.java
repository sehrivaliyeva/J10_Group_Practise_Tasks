package lesson24;

import lesson21and22.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Product product = new Product("Dior", 2500);
        Product product2 = new Product("Chanel", 15000);
        Product product3 = new Product("Zara", 300);
        Product product4 = new Product("Nike", 1000);
        Product product5 = new Product("Adidas", 2000);
        Product product6 = new Product("Puma", 1500);
        List<Product>products=new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .skip(3)
                .forEach(p -> System.out.println(p.getName()));



    }
}
