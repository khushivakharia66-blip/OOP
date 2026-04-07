interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double avg);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double avg) {
        return avg >= 60 ? "First Division" : "No First Division";
    }
}

class DemoResult {
    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("Passed: " + r.isPassed(55));
        System.out.println("Division: " + r.getDivision(65));
    }
}