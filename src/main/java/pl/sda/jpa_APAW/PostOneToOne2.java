package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;

public class PostOneToOne2 {

    public static void main(String[] args) {


        EntityManager entityManager = Engin.getEntityManager();

        entityManager.getTransaction().begin();

        Post2 post21 = new Post2("post21");
        post21.setDetails2(new PostDetails2("cn con"));
        entityManager.persist(post21);

        entityManager.getTransaction().commit();
    }
}
