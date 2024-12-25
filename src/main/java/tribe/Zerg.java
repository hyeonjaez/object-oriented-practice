package tribe;

import unit.zerg.*;

import java.util.ArrayList;

public class Zerg extends Tribe {

    private static final String[] UNIT = {"zergling", "hydralisk", "ultralisk", "mutalisk", "guardian", "queen"};
    private static final int PRODUCTION_NUMBER = 8;

    public Zerg() {
        unitList = new ArrayList<>();
        addUnit(PRODUCTION_NUMBER, UNIT);
    }

    public Zergling zergling() {
        return new Zergling();
    }

    public Hydralisk hydralisk() {
        return new Hydralisk();
    }

    public Ultralisk ultralisk() {
        return new Ultralisk();
    }

    public Mutalisk mutalisk() {
        return new Mutalisk();
    }

    public Guardian guardian() {
        return new Guardian();
    }

    public Queen queen() {
        return new Queen();
    }
}