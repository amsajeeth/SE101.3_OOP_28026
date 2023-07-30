
public class EmployeeTest {
    public static void main(String[] args) {
        Employee mrBogdan = new Employee();

        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr.Bogdan");
        mrBogdan.setEmpDesignation("Manager");

        Employee msBird = new Employee();

        msBird.setEmpID(202);
        msBird.setEmpName("Ms.Bird");
        msBird.setEmpDesignation("Developer");

        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}
