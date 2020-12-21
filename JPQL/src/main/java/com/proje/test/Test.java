package com.proje.test;

import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.repository.ProductRepository;

import java.util.Date;
import java.util.List;

public class Test {

    private static  ProductRepository productRepository = new ProductRepository();

    public static void main(String[] args) {
/*
        List<Product> products = productRepository.findProducts();
        for(Product product : products){
            System.out.println(product);
        }


        Product product = productRepository.findProductsById(3);
        System.out.println(product);


        List<String> productsNames = productRepository.findProductNames();
        for(String product : productsNames){
            System.out.println(product);
        }


        List<Product> products = productRepository.findLikeProductName("su");
        for(Product product : products){
            System.out.println(product);
        }


        List<Object[]> list = productRepository.findFunctionPrice();
        Object[] object = list.get(0);

        System.out.println("AVG: "+ object[0] +" | SUM :"+ object[1]+" | MAX :" + object[2]+ " | MIN :" + object[3]+ " | COUNT :" + object[4]);

*/

        List<Product> products = productRepository.findOrderByPrice();
        for(Product product : products){
            System.out.println(product);
        }
    }

    public static void insertData(){

        Brand brand1 = new Brand("Apple");
        Brand brand2 = new Brand("Samsung");
        Brand brand3 = new Brand("Nokia");
        Brand brand4 = new Brand("LG");
        Brand brand5 = new Brand("Sony");

        Category category1 = new Category("Bilgisayar");
        Category category2 = new Category("Tablet");
        Category category3 = new Category("Telefon");

        Product product1 = new Product("iphone 5", 3500, 2 , brand1 , category3 , new Date());
        Product product2 = new Product("LG 6", 2500, 1 , brand2 , category3 , new Date());
        Product product3 = new Product("Sony 6", 2700, 1 , brand3 , category3 , new Date());

        Product product4 = new Product("Samsung 3", 1700, 1 , brand2 , category1 , new Date());
        Product product5 = new Product("Mac 4", 4100, 1 , brand1 , category1 , new Date());
        Product product6 = new Product("Asus 6", 3100, 2 , brand5 , category1 , new Date());

        Product product7 = new Product("samsung 1", 2300, 2 , brand2 , category2 , new Date());
        Product product8 = new Product("ipad 3", 2600, 3 , brand1 , category2 , new Date());
        Product product9 = new Product("sony 7", 2400, 4 , brand5 , category2 , new Date());

        productRepository.saveBrand(brand1);
        productRepository.saveBrand(brand2);
        productRepository.saveBrand(brand3);
        productRepository.saveBrand(brand4);
        productRepository.saveBrand(brand5);

        productRepository.saveCategory(category1);
        productRepository.saveCategory(category2);
        productRepository.saveCategory(category3);

        productRepository.saveProduct(product1);
        productRepository.saveProduct(product2);
        productRepository.saveProduct(product3);
        productRepository.saveProduct(product4);
        productRepository.saveProduct(product5);
        productRepository.saveProduct(product6);
        productRepository.saveProduct(product7);
        productRepository.saveProduct(product8);
        productRepository.saveProduct(product9);


















    }
}
