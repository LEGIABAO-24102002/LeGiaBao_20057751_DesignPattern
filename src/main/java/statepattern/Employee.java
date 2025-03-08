package statepattern;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    private String name;
    private double baseSalary;
    private Position position;

    public Employee(String name, double baseSalary, Position position) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public double calculateSalary() {
        return baseSalary + position.getAllowance();
    }

    public void displaySalary() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
        String formattedTotal = currencyFormatter.format(calculateSalary());
        String formattedAllowance = currencyFormatter.format(position.getAllowance());
        System.out.println(name + " có thu nhập: " + formattedTotal
                + " (Phụ cấp " + position.getPositionName() + ": " + formattedAllowance + ")");
    }
}
