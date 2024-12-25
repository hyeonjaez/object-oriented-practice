package unit.terran;

import unit.Unit;

public class Marine extends Unit {
    private static final int EXTRA_ATTACK_POWER = 3;
    private static final int EXTRA_DEFENSE_POWER = 10;

    public Marine() {
        setAbility(EXTRA_ATTACK_POWER, EXTRA_DEFENSE_POWER);
        setItem();
        setCanFly();
    }


}