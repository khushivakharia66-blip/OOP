class Employee {
    String empName;
    String dept;

    Employee(String empName, String dept) {
        this.empName = empName;
        this.dept = dept;
    }

    void showDetails() {
        System.out.println("Name: " + empName);
        System.out.println("Department: " + dept);
    }
}

class Manager extends Employee {
    int members;
    String project;

    Manager(String empName, String dept, int members, String project) {
        super(empName, dept);
        this.members = members;
        this.project = project;
    }

    void showDetails() {
        System.out.println("Manager Name: " + empName);
        System.out.println("Department: " + dept);
        System.out.println("Team Members: " + members);
        System.out.println("Project: " + project);
    }
}

public class StaffInfo {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rohit", "HR");
        System.out.println("Employee Information");
        e1.showDetails();

        System.out.println();

        Manager m1 = new Manager("Neha", "IT", 5, "Website Development");
        System.out.println("Manager Information");
        m1.showDetails();
    }
}