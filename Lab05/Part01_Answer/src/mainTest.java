
public class mainTest {
    public static void main(String[] args) {
        Student student = new Student("Sajeeth",28026, "Data Science");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Course: " + student.getCourse());

        Lecturer lecturer = new Lecturer("Mr. Shafraz Sir", 20021, "OOP_Java");

        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}
