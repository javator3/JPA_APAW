package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class SelectEmployeeExample {

    public static void main(String[] args) {

        EntityManager entityManager = Engin.getEntityManager();
        
        entityManager.getTransaction().begin();
        
        TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e", Employee.class);

        List<Employee> resultList = query.getResultList();
resultList.stream()
        .forEach(employee -> System.out.println("employee = " + employee));
        
        entityManager.getTransaction().commit();
    }
}
