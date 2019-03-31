package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class EntityManagerPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

//       Employee em1 = new Employee("Prac 1", 1234L);
//        entityManager.persist(em1);
//
        Product pr1 = new Product("name1", BigDecimal.TEN);
        entityManager.persist(pr1);


        entityManager.getTransaction().commit();

    }
}
