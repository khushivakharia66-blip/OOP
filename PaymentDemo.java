import java.util.Scanner;

class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card");
    }
}

class UPIPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Credit Card Payment");
        System.out.println("2. UPI Payment");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        } else {
            p = new UPIPayment();
        }

        p.processPayment(amount);
    }
}