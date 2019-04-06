package pl.sda.jpa_APAW;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class M2MPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "M2M_Post_SDA",
    joinColumns = @JoinColumn(name = "Post_ID"),
    inverseJoinColumns = @JoinColumn(name = "Tag_id")
    )

    private List<M2MTags> tags = new ArrayList<>();

    public M2MPost() {
    }

    public M2MPost(String title) {
        this.title = title;
    }

    public void addTag (M2MTags tag){
        getTags().add(tag);
        tag.getPosts().add(this);
    }

    public List<M2MTags> getTags() {
        return tags;
    }
}
