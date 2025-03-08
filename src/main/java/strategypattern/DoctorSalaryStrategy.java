package strategypattern;

public class DoctorSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + getAllowance();
    }

    @Override
    public double getAllowance() {
        return 500000;
    }

    @Override
    public String getAllowanceName() {
        return "Tiến sĩ";
    }
}
