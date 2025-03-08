package nodesignpattern;

import java.text.NumberFormat;
import java.util.Locale;

class Employee {
    private String name;
    private double baseSalary;
    private String position;

    public Employee(String name, double baseSalary, String position) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    // Tính tổng lương (lương cơ bản + phụ cấp)
    public double calculateSalary() {
        return baseSalary + getAllowance();
    }

    // Lấy phụ cấp dựa theo chức vụ
    public double getAllowance() {
        double allowance = 0;
        switch (position) {
            case "Tiến sĩ":
                allowance = 500000;
                break;
            case "Trưởng khoa":
                allowance = 700000;
                break;
            case "Tổ trưởng":
                allowance = 300000;
                break;
            case "Trưởng phòng":
                allowance = 1000000;
                break;
            default:
                allowance = 0;
        }
        return allowance;
    }

    // Hiển thị thông tin lương cùng phụ cấp với định dạng tiền VND
    public void displaySalary() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
        String formattedSalary = currencyFormatter.format(calculateSalary());
        String formattedAllowance = currencyFormatter.format(getAllowance());
        System.out.println(name + " có thu nhập: " + formattedSalary
                + " (Phụ cấp " + position + ": " + formattedAllowance + ")");
    }
}