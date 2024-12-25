package player;

import tribe.Tribe;

import java.util.Random;

public class Computer extends Player {
    public Computer(Tribe tribe) {
        setTribe(tribe);
    }

    public int chooseRandomNumber(Tribe tribe) {
        Random random = new Random();
        return random.nextInt(tribe.getUnitList().size());
    }
}