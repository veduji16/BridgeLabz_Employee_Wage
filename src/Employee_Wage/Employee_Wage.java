package Employee_Wage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Attendance Program...\n");

        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4; // Assuming part-time hours are 4

        double employeeType = Math.floor(Math.random() * 10) % 3;

        if (employeeType == FULL_TIME) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is full-time present.");
            System.out.println("Daily wage: $" + dailyWage);
        } else if (employeeType == PART_TIME) {
            int dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Employee is part-time present.");
            System.out.println("Daily wage: $" + dailyWage);
        } else {
            System.out.println("Employee is absent.");
        }
    }
}
