class BankAccount {

    String account_holder_name;
    double balance;
    static double interest_rate = 5.0; // static variable (same for all accounts)

        BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

        void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
    }

    
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Updated Interest Rate: " + interest_rate + "%");
    }

    public static void main(String[] args) {

               BankAccount acc1 = new BankAccount("Khushi", 10000);
        BankAccount acc2 = new BankAccount("Swara", 20000);

              acc1.displayInterest();
        acc2.displayInterest();

        System.out.println();

              BankAccount.updateInterestRate(6.5);

        System.out.println();

                acc1.displayInterest();
        acc2.displayInterest();
    }
}