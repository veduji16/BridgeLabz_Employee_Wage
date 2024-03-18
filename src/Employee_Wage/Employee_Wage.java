package Employee_Wage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

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
    public static void calculateAndPrintWage(Company company, Map<String, Integer> companyWages) {
        int totalWage = 0;
        int workingDays = 20;
        System.out.println(company.getCompanyName());
        for (int day = 1; day <= workingDays; day++) {
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = company.calculateDailyWage(employeeType);
            totalWage += dailyWage;
            System.out.println("Day " + day + ": Daily wage: $" + dailyWage);
        }
        companyWages.put(company.getCompanyName(), totalWage);
        System.out.println("Total monthly wage: $" + totalWage);
    }

    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Wage Calculation Program...\n");

        Map<String, Integer> companyWages = new HashMap<>();
        List<Company> companies = new ArrayList<>();

        companies.add(new Company("Company A", 20, 8, 4));
        companies.add(new Company("Company B", 18, 7, 3));

        for (Company company : companies) {
            calculateAndPrintWage(company, companyWages);
            System.out.println();
        }

        for (Map.Entry<String, Integer> entry : companyWages.entrySet()) {
            System.out.println(entry.getKey() + " Total Monthly Wage: $" + entry.getValue());
        }
    }
}