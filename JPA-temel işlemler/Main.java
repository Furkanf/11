package com.proje.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction(); // islemin basarili olup olmama durumu

        Personel prs = new Personel(156465, "furkan", "demir" , new Date(), "250");

        prs.setPersonelId(1);

        transaction.begin();
        entityManager.merge(prs);
        transaction.commit();




    }
}
