import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {
    private String name;
    private String surname;
    private BigDecimal salary;

    public Employee(String name, String surname, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary for " + name  +
                " " + surname +
                " is " + salary.setScale(2, RoundingMode.HALF_EVEN);
    }
}
