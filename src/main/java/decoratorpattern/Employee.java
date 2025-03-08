package decoratorpattern;

import java.text.NumberFormat;
import java.util.Locale;

class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    // Base Employee không có thông tin phụ cấp
    public String getAllowanceDescription() {
        return "";
    }

    public void displaySalary() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
        String formattedSalary = currencyFormatter.format(getSalary());
        String allowanceDesc = getAllowanceDescription();
        if (!allowanceDesc.isEmpty()) {
            System.out.println(name + " có thu nhập: " + formattedSalary + " " + allowanceDesc);
        } else {
            System.out.println(name + " có thu nhập: " + formattedSalary);
        }
    }
}