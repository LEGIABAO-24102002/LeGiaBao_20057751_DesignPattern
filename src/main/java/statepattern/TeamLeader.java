package statepattern;

public class TeamLeader implements Position {
    @Override
    public double getAllowance() {
        return 300000;
    }

    @Override
    public String getPositionName() {
        return "Tổ trưởng";
    }
}