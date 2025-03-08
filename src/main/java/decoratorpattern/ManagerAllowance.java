package decoratorpattern;

import decoratorpattern.Employee;

public class ManagerAllowance extends AllowanceDecorator {
    public ManagerAllowance(Employee employee) {
        super(employee);
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

