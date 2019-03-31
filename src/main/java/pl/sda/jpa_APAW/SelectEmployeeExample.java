package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class SelectEmployeeExample {

    public static void main(String[] args) {

        EntityManager entityManager = Engin.getEntityManager();
        
//        entityManager.getTransaction().begin();
//
//        TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e", Employee.class);
//
//        List<Employee> resultList = query.getResultList();
//resultList.stream()
//        .forEach(employee -> System.out.println("employee = " + employee));
//
//        entityManager.getTransaction().commit();

//        entityManager.getTransaction().begin();
//
//        TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e order by name asc", Employee.class);
//
//        List<Employee> resultList = query.getResultList();
//        resultList.stream()
//                .forEach(employee -> System.out.println("employee = " + employee));
//
//        entityManager.getTransaction().commit();


//        entityManager.getTransaction().begin();
//
//        TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.salary > 2000", Employee.class);
//
//        List<Employee> resultList = query.getResultList();
//        resultList.stream()
//                .forEach(employee -> System.out.println("employee = " + employee));
//
//        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();

        TypedQuery<String> query = entityManager.createQuery("select e.name from Employee e where e.name like 'A%'", String.class);

        List<String> resultList = query.getResultList();
        resultList.stream()
                .forEach(employee -> System.out.println("employee = " + employee));

        entityManager.getTransaction().commit();

    }
}
