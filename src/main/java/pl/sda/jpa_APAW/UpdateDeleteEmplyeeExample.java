package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;

public class UpdateDeleteEmplyeeExample {

    public static void main(String[] args) {

        EntityManager entityManager = Engin.getEntityManager();

//        entityManager.getTransaction().begin();
//
//       int update = entityManager.createQuery("update Employee e set e.name =?1 where e.name =?2")
//                .setParameter(1, "imie5")
//                .setParameter(2, "imie4")
//                .executeUpdate();
//        System.out.println(update);
//
//        int update1 = entityManager.createQuery("delete from Employee e where e.salary < :maxSalary")
//        .setParameter("maxSalary", 100L)
//                .executeUpdate();
//        System.out.println(update1);
//
//        entityManager.getTransaction().commit();

//    entityManager.getTransaction().begin();
//
//    int update = entityManager
//            .createQuery("update Employee e set salary = salary * 2 where e.id > 17")
//            .executeUpdate();
//        System.out.println(update);
//
//    entityManager.getTransaction().commit();

    entityManager.getTransaction().begin();

    int update1 = entityManager
            .createQuery("delete from User u where u.login like 'zup%'")
            .executeUpdate();
        System.out.println(update1);

entityManager.getTransaction().commit();

    }
}
