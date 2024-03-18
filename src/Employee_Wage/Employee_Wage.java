package Employee_Wage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Attendance Program...\n");

        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;

        int employeeType = (int) Math.floor(Math.random() * 10) % 3;

        switch (employeeType) {
            case FULL_TIME:
                int fullTimeWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                System.out.println("Employee is full-time present.");
                System.out.println("Daily wage: $" + fullTimeWage);
                break;
            case PART_TIME:
                int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Employee is part-time present.");
                System.out.println("Daily wage: $" + partTimeWage);
                break;
            default:
                System.out.println("Employee is absent.");
        }
    }
}
