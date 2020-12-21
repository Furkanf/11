package com.proje.fpaFactoryImpl;

import com.proje.jpaFactory.JPAFactory;

import javax.persistence.*;

public class JPAFactoryImpl implements JPAFactory {

    private EntityManager entityManager = null;

    @Override
    public EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

        this.entityManager = factory.createEntityManager();

        return entityManager;
    }

    @Override
    public EntityTransaction getTransaction() {
        EntityTransaction transaction = this.entityManager.getTransaction();

        return transaction;
    }
}
