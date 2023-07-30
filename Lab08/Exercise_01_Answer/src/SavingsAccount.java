class SavingsAccount extends BankAccount {
    private static final double SAVINGS_INTEREST_RATE = 0.12;

    public double calculateInterest() {
        return getBalance() * SAVINGS_INTEREST_RATE;
    }

    public void dispalySaving(){
        System.out.println(calculateInterest());
    }
}