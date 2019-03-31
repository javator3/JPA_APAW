package pl.sda.jpa_APAW;

import javax.persistence.*;

@Entity
@Table(name = "employee3")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private Long salary;

    public Employee(){} // pusty konstruktor jest potrzebny dla hibernate

    public Employee(String name, Long salary) {

        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
