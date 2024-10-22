package Exo22;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        System.out.println("Create a Bank Account object (A/c No. " +
                accountNumber + ") with initial balance of $" + initialBalance + ":");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit $" + amount + " into account " + accountNumber + ":");
            System.out.println("New balance after depositing $" + amount + ": $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from account " + accountNumber + ":");
            System.out.println("New balance after withdrawing $" + amount + ": $" + balance);
        }
    }
}

class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Balance after trying to withdraw $" + amount + ": $" + balance);
        } else {
            System.out.println("Try to withdraw $" + amount + " from " + accountNumber + "!");
            System.out.println("Minimum balance of $" + MINIMUM_BALANCE + " required!");
            System.out.println("Balance after trying to withdraw $" + amount + ": $" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BA1234", 500);
        account1.deposit(1000);
        account1.withdraw(600);

        System.out.println();

        SavingsAccount savings1 = new SavingsAccount("SA1234", 450);
        savings1.withdraw(300);

        System.out.println();

        SavingsAccount savings2 = new SavingsAccount("SA1000", 300);
        savings2.withdraw(250);
    }
}