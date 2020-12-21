package proje.test;


import proje.model.Product;
import proje.repository.ProductRepository;

import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        /*
        List<Product> products = productRepository.findProduct();
        products.forEach(System.out::println);


        List<Product> products = productRepository.findById(5);
        products.forEach(System.out::println);


         List<Product> products = productRepository.findByCategoryName("Telefon");
        products.forEach(System.out::println);
         */

        int product = productRepository.findCount();
        System.out.println(product);

    }
}
