// Q7: BankAccount Class
// Demonstrates instance variables, class variable,
// local variables and deposit method

class BankAccount {

    // Instance variables
    long accountNumber;
    double balance;

    // Class (static) variable
    static String bankName = "State Bank of India";

    // Method to deposit money
    void deposit(double amount) {

        // Local variable to store the deposit amount
        double depositAmount = amount;

        // Update the account balance
        balance = balance + depositAmount;

        // Display deposit details
        System.out.println("Deposited Amount: Rs. " + depositAmount);
        System.out.println("Updated Balance: Rs. " + balance);
    }

    // Method to display account details
    void displayDetails() {

        // Local variables
        long accNumber = accountNumber;
        double accBalance = balance;
        String nameOfBank = bankName;

        // Display account information
        System.out.println("Bank Name: " + nameOfBank);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: Rs. " + accBalance);
    }

    public static void main(String[] args) {

        // Creating an object of BankAccount class
        BankAccount account = new BankAccount();

        // Local variables
        long accountNo = 1234567890L;
        double initialBalance = 5000.0;

        // Assigning values to instance variables
        account.accountNumber = accountNo;
        account.balance = initialBalance;

        // Display initial account details
        System.out.println("----- Account Details -----");
        account.displayDetails();

        System.out.println();

        // Local variable for deposit
        double amountToDeposit = 2000.0;

        // Calling deposit method
        account.deposit(amountToDeposit);

        System.out.println();

        // Display final account details
        System.out.println("----- Updated Account Details -----");
        account.displayDetails();
    }
}
