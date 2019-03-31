package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static pl.sda.jpa_APAW.Engin.getEntityManager;

public class UserOperationExample {

    public static void main(String[] args) {



        EntityManager entityManager = Engin.getEntityManager();

        entityManager.getTransaction().begin();

//        entityManager.persist(new User("nowyLogin"));
        User user = entityManager.find(User.class, 1L);
        user.setLogin("zupelnie nowy login2");
        entityManager.getTransaction().commit();

    }


}
