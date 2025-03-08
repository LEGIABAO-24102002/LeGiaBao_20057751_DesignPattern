package decoratorpattern;

import decoratorpattern.Employee;

public class DoctorAllowance extends AllowanceDecorator {
    public DoctorAllowance(Employee employee) {
        super(employee);
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