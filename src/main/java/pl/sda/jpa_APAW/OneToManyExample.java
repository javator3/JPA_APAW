package pl.sda.jpa_APAW;


import javax.persistence.EntityManager;

public class OneToManyExample {

    public static void main(String[] args) {

        EntityManager entityManager = Engin.getEntityManager();

        entityManager.getTransaction().begin();

//        PostOneToMany postOneToMany = new PostOneToMany("zajecia");
//        PostComment postComment = new PostComment("comment1");
//        postComment.setPostOneToMany(postOneToMany);
//        PostComment postComment1 = new PostComment("comment2");
//        postComment1.setPostOneToMany(postOneToMany);
//        PostComment postComment2 = new PostComment("comment3");
//        postComment2.setPostOneToMany(postOneToMany);
//
//        postOneToMany.getComments().add(postComment);
//        postOneToMany.getComments().add(postComment1);
//        postOneToMany.getComments().add(postComment2);
//
//        entityManager.persist(postOneToMany);

        PostComment postComment = entityManager.find(PostComment.class, 2L);
        System.out.println(postComment);
        PostOneToMany postOneToMany = postComment.getPostOneToMany();
        System.out.println(postOneToMany);



        entityManager.getTransaction().commit();

    }
}
