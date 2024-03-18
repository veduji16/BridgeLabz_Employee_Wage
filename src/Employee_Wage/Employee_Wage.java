package Employee_Wage;

import java.util.ArrayList;
import java.util.List;

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

class CompanyManager {
    private List<Company> companies;
    private List<Integer> companyWages;

    public CompanyManager() {
        this.companies = new ArrayList<>();
        this.companyWages = new ArrayList<>();
    }

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void calculateAndPrintWages() {
        for (Company company : companies) {
            int totalWage = 0;
            int workingDays = 20;
            System.out.println(company.getCompanyName());
            for (int day = 1; day <= workingDays; day++) {
                int employeeType = (int) Math.floor(Math.random() * 10) % 3;
                int dailyWage = company.calculateDailyWage(employeeType);
                totalWage += dailyWage;
                System.out.println("Day " + day + ": Daily wage: $" + dailyWage);
            }
            companyWages.add(totalWage);
            System.out.println("Total monthly wage for " + company.getCompanyName() + ": $" + totalWage);
            System.out.println();
        }
    }

    public void printTotalMonthlyWages() {
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName() + " Total Monthly Wage: $" + companyWages.get(i));
        }
    }
}

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("...Welcome to Employee Wage Calculation Program...\n");
        CompanyManager companyManager = new CompanyManager();
        companyManager.addCompany(new Company("Company A", 20, 8, 4));
        companyManager.addCompany(new Company("Company B", 18, 7, 3));
        companyManager.calculateAndPrintWages();
        companyManager.printTotalMonthlyWages();
    }
}