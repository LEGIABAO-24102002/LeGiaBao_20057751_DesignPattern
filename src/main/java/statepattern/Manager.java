package statepattern;

public class Manager implements Position {
    @Override
    public double getAllowance() {
        return 1000000;
    }

    @Override
    public String getPositionName() {
        return "Trưởng phòng";
    }
}