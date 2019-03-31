package pl.sda.jpa_APAW;

import javax.persistence.*;

@Entity
public class Post2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private PostDetails2 details;

    public Post2(String title) {
        this.title = title;
    }

    public Post2() {
    }

    public PostDetails2 getDetails() {
        return details;
    }

    public void setDetails2(PostDetails2 details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details=" + details +
                '}';
    }
}
