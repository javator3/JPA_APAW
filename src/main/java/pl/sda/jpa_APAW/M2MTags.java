package pl.sda.jpa_APAW;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class M2MTags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<M2MPost> posts = new ArrayList<>();

    public M2MTags() {
    }

    public M2MTags(String name) {
        this.name = name;
    }

    public List<M2MPost> getPosts() {
        return posts;
    }
}
