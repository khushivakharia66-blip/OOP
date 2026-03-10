class BankAccount2 {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened for " + accountHolderName);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        System.out.println("Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount(double rate, int years) {
        double maturity = balance * (1 + (rate * years / 100));
        System.out.println("Maturity Amount: " + maturity);
    }
}

public class BankDemo1 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Urvashi", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest(5);

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Urvashi", 20000);
        fd.deposit(5000);
        fd.checkBalance();
        fd.maturityAmount(7, 3);
    }
}