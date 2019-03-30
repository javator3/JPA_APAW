package pl.sda.jpa_APAW;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee3")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long salary;

    public Employee(){} // pusty konstruktor jest potrzebny dla hibernate

    public Employee(Long id, String name, Long salary) {
        this.id = id;
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
