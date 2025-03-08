package strategypattern;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    private String name;
    private double baseSalary;
    private SalaryStrategy salaryStrategy;

    public Employee(String name, double baseSalary, SalaryStrategy salaryStrategy) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salaryStrategy = salaryStrategy;
    }

    public double getSalary() {
        return salaryStrategy.calculateSalary(baseSalary);
    }

    public void displaySalary() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
        String formattedSalary = currencyFormatter.format(getSalary());
        String formattedAllowance = currencyFormatter.format(salaryStrategy.getAllowance());
        System.out.println(name + " có thu nhập: " + formattedSalary
                + " (Phụ cấp " + salaryStrategy.getAllowanceName() + ": " + formattedAllowance + ")");
    }
}
