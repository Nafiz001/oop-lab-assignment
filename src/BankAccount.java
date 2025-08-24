public class BankAccount {
    // Fields (Attributes)
    private String acNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String acNumber, String holderName, double initialBalance) {
        this.acNumber = acNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + acNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }

    // Getters (optional, for accessing fields if needed)
    public String getAcNumber() {
        return acNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}
