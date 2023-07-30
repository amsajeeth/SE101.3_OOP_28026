public class Main {
    public static void main(String[] args) {
        SavingsAccount sA = new SavingsAccount();
        sA.setBalance(20000000);
        sA.dispalySaving();

        CheckingAccount cA = new CheckingAccount();
        cA.setBalance(1000000);
        cA.dispalyCheck();
    }
}
 /* Output is 2400000.0
20000.0 */