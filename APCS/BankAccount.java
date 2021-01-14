package APCS;

public class BankAccount {
    private String name;
    private int accountNum;
    private double balance;
    private static int totalAccounts;

    public BankAccount() {
        name = "None";
        accountNum = -1;
        balance = 0;
        totalAccounts++;
    }
    public BankAccount(String name, int accountNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void withdraw(double money) {
        if (this.balance >= money) {
            this.balance -= money;
        } else {
            System.out.println("Insufficent funds");
        }
    }
    public void deposit(double money) {
        this.balance += money;
    }

    public String toString() {
        return "Name: " + name + ", Account Number: " + accountNum + ", Balance: " + balance;
    }
}