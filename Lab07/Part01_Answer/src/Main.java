public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();

        Student.Undergraduate undergraduate = student.new Undergraduate();
        undergraduate.display();
    }
}
/*Output is an error….
The display() method is declared as final, which means it cannot be overridden by any subclass.
but, there is no method body provided for display.
That’s why the code will not compile due to the missing method body for the display() method in the Student class.
*/
