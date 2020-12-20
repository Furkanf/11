package com.proje.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

        /*   Student student1 = new Student("furkan","demir",new Date(), new Contact("55555555","abc@abc.com"));

        transaction.begin();

        entityManager.persist(student1);

        transaction.commit();
    */

/*
        Student student1 = new Student("furkan","demir",new Date(), Arrays.asList("fizik","kimya","biyoloji")
                ,new Contact("55555555","abc@abc.com"));

        transaction.begin();

        entityManager.persist(student1);

        transaction.commit();

 */

        /*Student student1 = new Student("furkan", "demir", new Date(), new Contact("123456789","abc@abc.com"));
        Book book1 = new Book("9789750738609", "Şeker Portakalı", "Jose Mauro De Vasconcelos", "can yayınları", 200);
        Book book2 = new Book("1231233213609", "Fareler ve İnsanlar", "John Steinbeck", "can yayınları", 100);
        Book book3 = new Book("3213154321239", "İnce Memed 1", "Yaşar Kemal", "Yapı Kredi Yayınları", 400);

        student1.getBooks().add(book1);
        student1.getBooks().add(book2);
        student1.getBooks().add(book3);

         */




    }
}
