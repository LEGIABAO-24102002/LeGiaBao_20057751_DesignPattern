package strategypattern;

public class TeamLeaderSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + getAllowance();
    }

    @Override
    public double getAllowance() {
        return 300000;
    }

    @Override
    public String getAllowanceName() {
        return "Tổ trưởng";
    }
}
