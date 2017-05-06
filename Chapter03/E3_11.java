package Chapter03;

/**
 * E3.11 Implement a class Employee. An employee has a name (a string) and a
 * salary (a double). Provide a constructor with two arguments public
 * Employee(String employeeName, double currentSalary) and methods public String
 * getName() public double getSalary() public void raiseSalary(double byPercent)
 * These methods return the name and salary, and raise the employee’s salary by
 * a certain percentage. Sample usage: Employee harry = new Employee("Hacker,
 * Harry", 50000); harry.raiseSalary(10); // Harry gets a 10 percent raise
 *
 * Supply an EmployeeTester class that tests all methods.
 */
public class E3_11 {

    String name;
    double salary;

    public E3_11(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        salary = salary + salary * byPercent / 100;
    }
}
