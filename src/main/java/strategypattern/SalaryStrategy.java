package strategypattern;

public interface SalaryStrategy {
    double calculateSalary(double baseSalary);
    double getAllowance();
    String getAllowanceName();
}
