package Employee_Wage;

public class Employee_Wage {
    private final int FULL_TIME = 1;
    private final int PART_TIME = 2;
    private final int WAGE_PER_HOUR = 20;
    private final int FULL_DAY_HOURS = 8;
    private final int PART_TIME_HOURS = 4;
    private final int WORKING_DAYS_PER_MONTH = 20;
    private final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Attendance Program...\n");

        Employee_Wage employee = new Employee_Wage();
        employee.calculateMonthlyWage();
    }

    public void calculateMonthlyWage() {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int workingDays = 0;

        while (workingDays < WORKING_DAYS_PER_MONTH && totalWorkingHours < MAX_WORKING_HOURS) {
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeType) {
                case FULL_TIME:
                    totalWage += WAGE_PER_HOUR * FULL_DAY_HOURS;
                    totalWorkingHours += FULL_DAY_HOURS;
                    break;
                case PART_TIME:
                    totalWage += WAGE_PER_HOUR * PART_TIME_HOURS;
                    totalWorkingHours += PART_TIME_HOURS;
                    break;
                default:
            }

            workingDays++;
        }

        System.out.println("Total monthly wage: $" + totalWage);
        System.out.println("Total working hours: " + totalWorkingHours);
        System.out.println("Working days: " + workingDays);
    }
}
