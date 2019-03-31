package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;

public class PostOneToOne {

    public static void main(String[] args) {


        EntityManager entityManager = Engin.getEntityManager();

        entityManager.getTransaction().begin();

        Post post1 = new Post("post1");
        post1.setDetails(new PostDetails("con con"));

        entityManager.persist(post1);

        entityManager.getTransaction().commit();
    }
}
