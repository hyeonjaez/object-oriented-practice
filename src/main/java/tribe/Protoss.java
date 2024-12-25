package tribe;

import unit.protoss.*;

import java.util.ArrayList;

public class Protoss extends Tribe {

    private static final String[] UNIT = {"zealot", "dragoon", "highTempler", "scout", "corsair", "carrier"};
    private static final int PRODUCTION_NUMBER = 4;

    public Protoss() {
        unitList = new ArrayList<>();
        addUnit(PRODUCTION_NUMBER, UNIT);
    }

    public Zealot zealot() {
        return new Zealot();
    }

    public Dragoon dragoon() {
        return new Dragoon();
    }

    public HighTempler highTempler() {
        return new HighTempler();
    }

    public Scout scout() {
        return new Scout();
    }

    public Corsair corsair() {
        return new Corsair();
    }

    public Carrier carrier() {
        return new Carrier();
    }
}