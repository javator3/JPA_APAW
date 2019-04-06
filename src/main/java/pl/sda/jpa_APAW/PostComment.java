package pl.sda.jpa_APAW;


import javax.persistence.*;

@Entity
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Post_id")
    private PostOneToMany postOneToMany;


    public PostComment() {
    }

    public PostComment(String content) {
        this.content = content;
    }

    public PostOneToMany getPostOneToMany() {
        return postOneToMany;
    }

    public void setPostOneToMany(PostOneToMany postOneToMany) {
        this.postOneToMany = postOneToMany;
    }
}
