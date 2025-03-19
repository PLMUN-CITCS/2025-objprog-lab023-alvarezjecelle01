// BankAccount class representing a bank account with different access modifiers
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder; // Public access - can be accessed anywhere
    private double balance; // Private access - can only be accessed within the class
    protected String accountType; // Protected access - accessible in the same package and subclasses

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) { // Only deposit positive amounts
            balance += amount;
        }
    }

    // M
