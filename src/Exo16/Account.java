package Exo16;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = "Invalid";
        } else {
            this.accountNumber = accountNumber;
        }

        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public void afficherInfos(String numero) {
        System.out.println("Account " + numero + " Number: " + accountNumber);
        System.out.println("Account " + numero + " Balance: " + balance);
    }

    public static void main(String[] args) {
        Account compte1 = new Account("12340009", 1000.0);
        compte1.afficherInfos("1");

        Account compte2 = new Account("", -500.0);
        Account compte3 = new Account(null, 100.0);
    }
}
