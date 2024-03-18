package Employee_Wage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Attendance Program...\n");

        final int FULL_TIME = 1;

        double employeeType = Math.floor(Math.random() * 10) % 2;

        if (employeeType == FULL_TIME) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }
}
