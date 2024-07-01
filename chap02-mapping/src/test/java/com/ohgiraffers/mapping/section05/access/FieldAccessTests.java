package com.ohgiraffers.mapping.section05.access;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class FieldAccessTests {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager(){
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterEach
    public void closeManager(){
        this.entityManager.close();
    }

    @AfterAll
    public static void closeFactory(){
        entityManagerFactory.close();
    }

    @Test
    public void 필드_접근_테스트(){
        ////Member member = new Member(0,"String memberId", "String memberPwd", "String nickName");
        //
        //EntityTransaction transaction = entityManager.getTransaction();
        //transaction.begin();
        //entityManager.persist(member);
        //transaction.commit();

    }

    @Test
    public void 조회테스트(){
        Member member = entityManager.find(Member.class, 1);
        System.out.println(member);
    }
}
