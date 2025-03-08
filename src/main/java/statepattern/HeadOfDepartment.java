package statepattern;

public class HeadOfDepartment implements Position {
    @Override
    public double getAllowance() {
        return 700000;
    }

    @Override
    public String getPositionName() {
        return "Trưởng khoa";
    }
}