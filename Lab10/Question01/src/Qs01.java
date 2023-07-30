import java.util.Scanner;

public class Qs01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            float n1,n2,ans;
            System.out.print("Enter the First Number: ");
            n1 = scanner.nextInt();
            System.out.print("Enter the Deviding Number: ");
            n2 = scanner.nextInt();
            ans = n1 / n2;
            System.out.println("Result: " +ans);

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
        finally {
            scanner.close();
        }
    }	}
