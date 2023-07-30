
public class Main {
    public static void main(String[] args) {
        Speaker politician = new Politician();
        Speaker priest = new Priest();
        Speaker lecturer = new Lecturer();

        politician.speak(); // Output: Talk politics
        priest.speak();     // Output: Religious Talks
        lecturer.speak();   // Output: Talks Object Oriented Design and Programming!
    }
}
