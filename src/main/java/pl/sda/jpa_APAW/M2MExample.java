package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;

public class M2MExample {

    public static void main(String[] args) {

        EntityManager entityManager = Engin.getEntityManager();

        entityManager.getTransaction().begin();

        M2MPost post = new M2MPost("tytuł 2");
        M2MTags tag = new M2MTags("tag2");
        post.addTag(tag);

        entityManager.persist(post);

        M2MPost post1 = entityManager.find(M2MPost.class, 2L);
        M2MTags m2MTags = entityManager.find(M2MTags.class, 1L);

        post1.addTag(m2MTags);

        entityManager.getTransaction().commit();
    }
}
