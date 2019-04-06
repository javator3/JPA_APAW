package pl.sda.jpa_APAW;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;


    public PostComment() {
    }

    public PostComment(String content) {
        this.content = content;
    }


}
