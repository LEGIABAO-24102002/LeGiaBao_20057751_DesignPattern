package strategypattern;

public class HeadOfDepartmentSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + getAllowance();
    }

    @Override
    public double getAllowance() {
        return 700000;
    }

    @Override
    public String getAllowanceName() {
        return "Trưởng khoa";
    }
}