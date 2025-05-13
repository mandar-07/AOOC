import java.util.*;

public class Bank {
    protected int accno;
    protected double balance;
    protected String name;
    protected Scanner sc = new Scanner(System.in);

    public Bank(int accno, double balance, String name) {
        this.accno = accno;
        this.balance = balance;
        this.name = name;
    }

    void deposit() {
        System.out.println("Enter the amount you want to deposit:");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    void withdraw() {
        System.out.println("Enter the amount you want to withdraw:");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public static void main(String args[]) {
        Bank account = new Bank(12345, 500.0, "John Doe");
        account.deposit();
        account.withdraw();

        savings savingsAccount = new savings(67890, 200.0, "Jane Doe");
        savingsAccount.withdraw();
    }
}

class savings extends Bank {
    public savings(int accno, double balance, String name) {
        super(accno, balance, name);
    }

    @Override
    void withdraw() {
        if (balance < 100) {
            System.out.println("You cannot withdraw. Minimum balance must be maintained.");
        } else {
            System.out.println("Enter the amount you want to withdraw:");
            double amount = sc.nextDouble();
            if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
        }
    }
}
