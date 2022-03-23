package Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000, 54, 1975);
        employee.vergi();
        employee.bonus();
        employee.zam();
        employee.printEmployee();
    }
}