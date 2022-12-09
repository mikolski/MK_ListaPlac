import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee("Jack", "Jackson", new BigDecimal(5780.48));
        Employee employee2 = new Employee("John", "Johnson", new BigDecimal(6364.46));
        Employee employee3 = new Employee("Mike", "Myson", new BigDecimal(7983.78));
        Employee employee4 = new Employee("Luke", "Earthwalker", new BigDecimal(8454.45));
        Employee employee5 = new Employee("Bobby", "Brown", new BigDecimal(9334.23));

        Company company = new Company();
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);

        System.out.println("Suma zarobków wszystkich pracowników: " + company.getSum());
        System.out.println("Średnia zarobków wszystkich pracowników: " + company.getAvr());
        company.printEmployees();

    }
}
