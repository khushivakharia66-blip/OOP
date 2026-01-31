import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void searchAccount(BankAccount[] accounts, String id) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(id)) {
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount();
        accounts[0].assignValues("A101", "Bansi", 55000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("A102", "Payal", 18200);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("A103", "Khushi", 12000);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("A104", "Urvashi", 7600);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A105", "Kuldeep", 9400);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
            System.out.println();
        }

        String searchId = sc.nextLine();
        searchAccount(accounts, searchId);
    }
}
