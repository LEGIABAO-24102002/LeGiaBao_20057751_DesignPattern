package statepattern;

public class Doctor implements Position {
    @Override
    public double getAllowance() {
        return 500000;
    }

    @Override
    public String getPositionName() {
        return "Tiến sĩ";
    }
}
