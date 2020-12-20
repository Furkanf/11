package com.proje.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFind {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student1 = entityManager.find(Student.class, 1);
        Student student2 = entityManager.find(Student.class, 2);
        Student student3 = entityManager.find(Student.class, 3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
