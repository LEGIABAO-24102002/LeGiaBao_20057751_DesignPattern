package strategypattern;

public class ManagerSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + getAllowance();
    }

    @Override
    public double getAllowance() {
        return 1000000;
    }

    @Override
    public String getAllowanceName() {
        return "Trưởng phòng";
    }
}
