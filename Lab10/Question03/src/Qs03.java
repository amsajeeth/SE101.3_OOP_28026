import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Qs03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();

            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! Please check the file path and try again.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong!");
        } finally {
            scanner.close();
        }
    }
}
