package Employee_Wage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Attendance Program...\n");

        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS_PER_MONTH = 20;

        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeType) {
                case FULL_TIME:
                    totalWage += WAGE_PER_HOUR * FULL_DAY_HOURS;
                    break;
                case PART_TIME:
                    totalWage += WAGE_PER_HOUR * PART_TIME_HOURS;
                    break;
                default:
            }
        }

        System.out.println("Total monthly wage: $" + totalWage);
    }
}
