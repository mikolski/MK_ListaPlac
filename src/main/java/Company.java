import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void printEmployees(){
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
    public BigDecimal getSum(){
        BigDecimal salariesSum = BigDecimal.ZERO;
        for (Employee employee: employees) {
            salariesSum = salariesSum.add(employee.getSalary());
        }
        return salariesSum.setScale(2, RoundingMode.HALF_EVEN);
    }
    public BigDecimal getAvr(){
        if(employees.size()>0) {
            return getSum().divide(BigDecimal.valueOf(employees.size())).setScale(2, RoundingMode.HALF_EVEN);
        }
        return BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    }
}
