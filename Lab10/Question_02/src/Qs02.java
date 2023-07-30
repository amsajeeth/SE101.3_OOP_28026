import java.util.Scanner;

public class Qs02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println(" Something went wrong!");
        } finally {
            scanner.close();
        }
    }
}
