package proje.repository;

import proje.fpaFactoryImpl.JPAFactoryImpl;
import proje.jpaFactory.JPAFactory;
import proje.model.Brand;
import proje.model.Category;
import proje.model.Product;
import proje.query.*;

import javax.persistence.*;
import java.util.List;

public class ProductRepository{
    private JPAFactory jpaFactory = new JPAFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager();

    public List<Product> findProduct(){
        TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findProducts", Product.class);
        List<Product> products = typedQuery.getResultList();
        return products;
    }

    public List<Product> findById(int productId){
        TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findById", Product.class);
        typedQuery.setParameter("productId",productId);
        List<Product> products = typedQuery.getResultList();
        return products;
    }

    public List<Product> findByCategoryName(String categoryName){
        TypedQuery<Product> typedQuery = this.entityManager.createNamedQuery("Product.findByCategoryName", Product.class);
        typedQuery.setParameter("name",categoryName);
        List<Product> products = typedQuery.getResultList();
        return products;
    }



    public int findCount(){
        TypedQuery<Long> typedQuery = this.entityManager.createNamedQuery("Product.findCount", Long.class);

        Long count = typedQuery.getSingleResult();
        return count.intValue();
    }










}