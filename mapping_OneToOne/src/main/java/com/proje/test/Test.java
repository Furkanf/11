package com.proje.test;

import com.proje.model.Laptop;
import com.proje.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = factory.createEntityManager();

        Student student1 = new Student("furkan","demir",2);
        Student student2 = new Student("ahmet","balık",3);

        Laptop laptop1 = new Laptop("asus",2500);
        Laptop laptop2 = new Laptop("dell",3500);

        student1.setLaptop(laptop1);
        student2.setLaptop(laptop2);

        entityManager.getTransaction().begin();

        entityManager.persist(student1);
        entityManager.persist(laptop1);
        entityManager.persist(student2);
        entityManager.persist(laptop2);

        entityManager.getTransaction().commit();



    }
}
