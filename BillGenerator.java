import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        System.out.println("Final Bill Amount: " + (itemTotal - discount));
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        int choice = sc.nextInt();
        int total = sc.nextInt();

        if (choice == 1) {
            bg.generateBill(total);
        } 
        else if (choice == 2) {
            int discount = sc.nextInt();
            bg.generateBill(total, discount);
        } 
        else if (choice == 3) {
            double percent = sc.nextDouble();
            bg.generateBill(total, percent);
        }
    }
}
