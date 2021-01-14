package APCS;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Bob", 2, 1.20);

        account1.withdraw(100.00);
        account1.deposit(50.00);
        account2.deposit(75.00);
        account2.withdraw(1.20);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        System.out.print(BankAccount.getTotalAccounts());
    }
}