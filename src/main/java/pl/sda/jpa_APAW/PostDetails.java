package pl.sda.jpa_APAW;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    public PostDetails() {
    }

    public PostDetails(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostDetails{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
