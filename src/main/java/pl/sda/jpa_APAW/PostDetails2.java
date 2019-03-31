package pl.sda.jpa_APAW;

import javax.persistence.*;

@Entity
public class PostDetails2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @OneToOne(mappedBy = "details")
    private Post2 post2;

    public PostDetails2() {
    }

    public PostDetails2(String content) {
        this.content = content;
    }

    public Post2 getPost2() {
        return post2;
    }

    public void setPost2(Post2 post2) {
        this.post2 = post2;
    }

    @Override
    public String toString() {
        return "PostDetails{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
