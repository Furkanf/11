package com.proje.test;

import com.proje.model.Lesson;
import com.proje.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Lesson lesson1 = new Lesson("tarih","ahmet", 5);
        Lesson lesson2 = new Lesson("matematik","kasim", 3);
        Lesson lesson3 = new Lesson("turkce","mehmet", 4);
        Lesson lesson4 = new Lesson("ingilizce","burcu", 4);
        Student student1 = new Student("mahmut","kaya",new Date());
        Student student2 = new Student("kerim","dert",new Date());
        Student student3 = new Student("cenk","sert",new Date());
        student1.addLesson(lesson1);
        student1.addLesson(lesson2);
        student1.addLesson(lesson3);
        student2.addLesson(lesson1);
        student2.addLesson(lesson3);
        student3.addLesson(lesson2);
        student3.addLesson(lesson4);
        student3.addLesson(lesson3);

        entityManager.getTransaction().begin();

        entityManager.persist(student1);
        entityManager.persist(student3);
        entityManager.persist(student2);

        entityManager.persist(lesson1);
        entityManager.persist(lesson2);
        entityManager.persist(lesson3);
        entityManager.persist(lesson4);

        entityManager.getTransaction().commit();
    }
}
