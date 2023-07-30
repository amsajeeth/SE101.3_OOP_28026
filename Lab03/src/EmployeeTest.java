
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Bogdan",16,50000.00f);

        emp.setName("Bogdan");
        emp.setBasicSalary(50000.00f);

        System.out.println("Employee Name is: " + emp.getName());
        System.out.println("Basic Salary is: " + emp.getBasicSalary());

        double bonus = 10000.0;
        double totalSalary = emp.calculateBonusAmount(bonus);

        System.out.println("Bonus: " + bonus);
        System.out.println("Bonus Amount: " + totalSalary);
    }
}
