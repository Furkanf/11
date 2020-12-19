package com.proje.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

 /*     Student student1 = new Student("berk", "kus", new Date());
        Student student2 = new Student("furkan", "demir", new Date());

        transaction.begin();

        entityManager.persist(student1);
        entityManager.persist(student2);

        transaction.commit();
  */
        Student student1 = new Student("furkan","demir",new Date(), new Contact("55555555","abc@abc.com"));

        transaction.begin();

        entityManager.persist(student1);

        transaction.commit();


    }
}
