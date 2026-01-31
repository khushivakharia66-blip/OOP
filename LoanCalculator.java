class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float interest = (principal * rate * time) / 100;
        float total = principal + interest;
        float emi = total / (time * 12);
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double interest = (principal * rate * time) / 100;
        double total = principal + interest;
        double emi = total / (time * 12);
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        int rate = 10;
        int interest = (principal * rate * time) / 100;
        int total = principal + interest;
        int emi = total / (time * 12);
        System.out.println("Personal Loan EMI: " + emi);
    }

    public static void main(String[] args) {
        LoanCalculator lc = new LoanCalculator();

        lc.calculateEMI(500000, 20, 8.5f);
        lc.calculateEMI(300000, 5, 9.2);
        lc.calculateEMI(100000, 2);
    }
}
