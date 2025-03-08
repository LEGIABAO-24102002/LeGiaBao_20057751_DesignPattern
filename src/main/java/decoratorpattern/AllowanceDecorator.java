package decoratorpattern;

import decoratorpattern.Employee;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class AllowanceDecorator extends Employee {
    protected Employee employee;

    public AllowanceDecorator(Employee employee) {
        super(employee.getName(), employee.getSalary());
        this.employee = employee;
    }

    @Override
    public double getSalary() {
        return employee.getSalary() + getAllowance();
    }

    public abstract double getAllowance();

    public abstract String getAllowanceName();

    @Override
    public String getAllowanceDescription() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
        return "(Phụ cấp " + getAllowanceName() + ": " + currencyFormatter.format(getAllowance()) + ")";
    }
}