package com.proje.repository;

import com.proje.fpaFactoryImpl.JPAFactoryImpl;
import com.proje.jpaFactory.JPAFactory;
import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.query.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProductRepository{
    private JPAFactory jpaFactory = new JPAFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager();
    private EntityTransaction entityTransaction = jpaFactory.getTransaction();

    public Product saveProduct(Product product){
        this.entityTransaction.begin();
        this.entityManager.persist(product);
        this.entityTransaction.commit();
        return product;
    }

    public Brand saveBrand(Brand brand){
        this.entityTransaction.begin();
        this.entityManager.persist(brand);
        this.entityTransaction.commit();
        return brand;
    }

    public Category saveCategory(Category category){
        this.entityTransaction.begin();
        this.entityManager.persist(category);
        this.entityTransaction.commit();
        return category;
    }

    public List<Product> findProducts(){
        TypedQuery<Product> typedQuery = this.entityManager.createQuery(query.findProducts, Product.class);
        List<Product> products = typedQuery.getResultList();
        return products;
    }

    public Product findProductsById(int productId){
        TypedQuery<Product> typedQuery = this.entityManager.createQuery(query.findProductsById, Product.class);
        typedQuery.setParameter("productId", productId);
        Product product = typedQuery.getSingleResult();
        return product;
    }

    public List<String> findProductNames(){
        TypedQuery<String> typedQuery = this.entityManager.createQuery(query.findProductNames, String.class);

        List<String> productNames = typedQuery.getResultList();
        return productNames;
    }

    public List<Product> findGreatPrice(double unitPrice){
        TypedQuery<Product> typedQuery = this.entityManager.createQuery(query.findGreatPrice, Product.class);
        typedQuery.setParameter("unitPrice", unitPrice);

        List<Product> products = typedQuery.getResultList();
        return products;
    }

    public List<Product> findLikeProductName(String productName){
        TypedQuery<Product> typedQuery = this.entityManager.createQuery(query.findLikeProductName, Product.class);
        typedQuery.setParameter("productName", "%"+productName+"%");

        List<Product> products = typedQuery.getResultList();
        return products;
    }

    public List<Object[]> findFunctionPrice(){
        Query query = this.entityManager.createQuery("SELECT AVG(p.unitPrice), SUM(p.unitPrice), MAX(p.unitPrice), MIN(p.unitPrice), COUNT(p) FROM Product p");

        List<Object[]> functionPrice = query.getResultList();

        return  functionPrice;
    }

    public List<Product> findOrderByPrice(){
        TypedQuery<Product> typedQuery = this.entityManager.createQuery(query.findOrderByPrice, Product.class);

        List<Product> products = typedQuery.getResultList();
        return products;
    }














}