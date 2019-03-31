package pl.sda.jpa_APAW;

import javax.persistence.EntityManager;

public class EmbeddedExample {

    public static void main(String[] args) {

        EntityManager entityManager = Engin.getEntityManager();

        entityManager.getTransaction().begin();

        Client client = new Client("firstname", "lastname");
        client.setAddress(new Address("street", "city", "postal"));
        entityManager.persist(client);

        entityManager.getTransaction().commit();

    }
}
