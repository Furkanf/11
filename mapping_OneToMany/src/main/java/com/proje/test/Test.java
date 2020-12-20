package com.proje.test;

import com.proje.model.Laptop;
import com.proje.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = factory.createEntityManager();

        Student student1 = new Student("furkan", "demir",3);
        Student student2 = new Student("mert", "bayir",4);

        Laptop laptop1 = new Laptop("asus", 3500);
        Laptop laptop2 = new Laptop("dell", 2500);
        Laptop laptop3 = new Laptop("lenovo", 5000);
        Laptop laptop4 = new Laptop("casper", 4500);

        laptop1.setStudent(student1);
        laptop2.setStudent(student1);
        laptop3.setStudent(student2);
        laptop4.setStudent(student1);
        /*
        student1.addLaptop(laptop1);
        student1.addLaptop(laptop2);
        student1.addLaptop(laptop4);
        student2.addLaptop(laptop3);
         */

        entityManager.getTransaction().begin();
        /*
        entityManager.persist(student1);
        entityManager.persist(student2);
         */
        entityManager.persist(laptop1);
        entityManager.persist(laptop2);
        entityManager.persist(laptop3);
        entityManager.persist(laptop4);
        entityManager.getTransaction().commit();


    }
}
