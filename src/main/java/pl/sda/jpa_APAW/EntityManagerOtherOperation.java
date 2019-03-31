package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerOtherOperation {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, 3L);
//        System.out.println(employee);
//        employee.setName("prac nowy");

//        entityManager.remove(employee);

//        entityManager.detach(employee);
//        employee.setSalary(123455L);
//        System.out.println(employee);

        entityManager.detach(employee);
        employee.setSalary(12312444L);
        entityManager.merge(employee);

        entityManager.getTransaction().commit();

    }
}
