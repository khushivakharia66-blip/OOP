public class University {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "OpenAI University";
        totalStudents = 0;
        System.out.println("1. Static Block Executed: University Name Initialized");
    }

    {
        System.out.println("3. Instance Block Executed: Object is being created...");
    }

    University() {
        totalStudents++;
        System.out.println("4. Constructor Executed: Student Created");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("2. Main Method Started");

        University s1 = new University();
        University s2 = new University();

        System.out.println("5. Total Students Created: " + University.getTotalStudents());
        System.out.println("University Name: " + universityName);
    }
}
