package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerOtherOperation {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, 1L);
        System.out.println(employee);
        employee.setName("prac nowy");

        entityManager.getTransaction().commit();

    }
}
