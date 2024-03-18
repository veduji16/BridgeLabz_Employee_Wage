package Employee_Wage;

class Company {
    private final String companyName;
    private final int wagePerHour;
    private final int fullDayHours;
    private final int partTimeHours;

    public Company(String companyName, int wagePerHour, int fullDayHours, int partTimeHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int calculateDailyWage(int employeeType) {
        switch (employeeType) {
            case 1:
                return wagePerHour * fullDayHours;
            case 2:
                return wagePerHour * partTimeHours;
            default:
                return 0;
        }
    }
}

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Wage Calculation Program...\n");

        Company companyA = new Company("Company A", 20, 8, 4);
        Company companyB = new Company("Company B", 18, 7, 3);

        calculateAndPrintWage(companyA);
        System.out.println();
        calculateAndPrintWage(companyB);
    }

    public static void calculateAndPrintWage(Company company) {
        int totalWage = 0;
        int workingDays = 20;

        System.out.println(company.getCompanyName());

        for (int day = 1; day <= workingDays; day++) {
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = company.calculateDailyWage(employeeType);
            totalWage += dailyWage;
            System.out.println("Day " + day + ": Daily wage: $" + dailyWage);
        }
        System.out.println("Total monthly wage: $" + totalWage);
    }
}
