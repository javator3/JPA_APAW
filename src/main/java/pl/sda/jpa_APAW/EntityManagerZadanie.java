package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;
import java.util.Scanner;

public class EntityManagerZadanie {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager entityManager = emf.createEntityManager();

//        entityManager.getTransaction().begin();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj nr id pracownika");
//        Long a = scanner.nextLong();
//
//        Employee employee = entityManager.find(Employee.class, a);
//
//        if (employee == null){
//            System.out.println("brak pracownika o danym id");
//        } else {
//            System.out.println(employee.getSalary());
//        }
//        entityManager.getTransaction().commit();

//        entityManager.getTransaction().begin();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj ilu pracowników dodać");
//        Long a = scanner.nextLong();
//
//
//        for (int i = 0; i < a; i++) {
//            Employee em = new Employee("Andy", 333L);
//            entityManager.persist(em);
//
//        }
//
//        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj id pracownika");
        Long a = scanner.nextLong();

        Employee employee = entityManager.find(Employee.class, a);

        if (employee != null) {
            System.out.println(employee);
            entityManager.remove(employee);
        }else{
            System.out.println("pracownik o danym id nie istnieje");
        }

        entityManager.getTransaction().commit();

//entityManager.getTransaction().begin();
//
//
//Long salary = Optional.ofNullable(entityManager.find(Employee.class, 1L))
//        .map(employ ->employ.getSalary())
//        .orElse(0L);
//
//entityManager.getTransaction().commit();



    }
}
