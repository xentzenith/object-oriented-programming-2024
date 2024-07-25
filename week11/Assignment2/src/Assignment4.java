public class Assignment4 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 1000.00);
        CheckingAccount checking = new CheckingAccount("CA12345", 500.00);

        System.out.println("Savings Account Initial Balance: " + savings.getBalance());
        savings.deposit(200.00);
        System.out.println("Savings Account Balance after Deposit: " + savings.getBalance());
        savings.withdraw(150.00);
        System.out.println("Savings Account Balance after Withdrawal: " + savings.getBalance());
        savings.withdraw(1200.00); // Attempt to withdraw more than available balance

        // Test deposit and withdrawal for CheckingAccount
        System.out.println("\nChecking Account Initial Balance: " + checking.getBalance());
        checking.deposit(100.00);
        System.out.println("Checking Account Balance after Deposit: " + checking.getBalance());
        checking.withdraw(200.00);
        System.out.println("Checking Account Balance after Withdrawal: " + checking.getBalance());
        checking.withdraw(600.00); // Attempt to withdraw more than available balance
    }
}
