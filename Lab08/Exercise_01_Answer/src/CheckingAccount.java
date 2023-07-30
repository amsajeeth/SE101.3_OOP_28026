class CheckingAccount extends BankAccount {
    private static final double CHECKING_INTEREST_RATE = 0.02;
    public double calculateInterest() {
        return getBalance() * CHECKING_INTEREST_RATE;
    }
    public void dispalyCheck(){
        System.out.println(calculateInterest());
    }
}