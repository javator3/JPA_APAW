package pl.sda.jpa_APAW;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity

public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @Column (unique = true, nullable = false)
    private String name;
    @Column (nullable = false)
    private BigDecimal cena;

    public Product (){};

    public Product(Long id, String name, BigDecimal cena) {
        this.id = id;
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
}
