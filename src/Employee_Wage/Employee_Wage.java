package Employee_Wage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Attendance Program...\n");

        final int FULL_TIME = 1;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;

        double employeeType = Math.floor(Math.random() * 10) % 2;

        if (employeeType == FULL_TIME) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is present.");
            System.out.println("Daily wage: $" + dailyWage);
        } else {
            System.out.println("Employee is absent.");
        }
    }
}
