package pl.sda.jpa_APAW;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @Column (unique = true, nullable = false)
    private String name;
    @Column (nullable = false)
    private BigDecimal cena;

    public Product (){};

    public Product(String name, BigDecimal cena) {
        this.name = name;
        this.cena = cena;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cena=" + cena +
                '}';
    }
}
