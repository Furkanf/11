package com.proje.test;

import com.proje.model.Laptop;
import com.proje.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFind {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = factory.createEntityManager();

        Laptop laptop = entityManager.find(Laptop.class, 1);
        Student student = entityManager.find(Student.class, 1);

        //System.out.println(laptop);
        //System.out.println(student);

        System.out.println(laptop);
        System.out.println(laptop.getStudent());
    }
}
