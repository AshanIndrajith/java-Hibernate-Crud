package entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Scanner myObj = new Scanner(System.in);


        try {
//             et.begin();
//            StudentEntity stu = new StudentEntity('1',"koshika","TEC001");
//            em.persist(stu);
//             et.commit();








        } finally {
            if (et.isActive()) {
                et.rollback();
            }
            em.close();
            emf.close();
        }


    }

}
