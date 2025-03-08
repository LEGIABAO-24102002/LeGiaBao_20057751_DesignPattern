package decoratorpattern;

import decoratorpattern.Employee;

public class HeadOfDepartmentAllowance extends AllowanceDecorator {
    public HeadOfDepartmentAllowance(Employee employee) {
        super(employee);
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
