package pl.sda.jpa_APAW;


import javax.persistence.*;
import java.util.List;

@Entity
public class PostOneToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Comment_id")
    private List<PostComment> comments;




    public PostOneToMany() {
    }

    public PostOneToMany(String title) {
        this.title = title;
    }

    public List<PostComment> getComments() {
        return comments;
    }

    public void setComments(List<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PostOneToMany{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}
