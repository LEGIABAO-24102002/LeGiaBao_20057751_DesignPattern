package decoratorpattern;

import decoratorpattern.Employee;

public class TeamLeaderAllowance extends AllowanceDecorator {
    public TeamLeaderAllowance(Employee employee) {
        super(employee);
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

