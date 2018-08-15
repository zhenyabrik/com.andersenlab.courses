package game.race.race.undeads;

import game.Character;
import game.RaceType;
import game.skills.Attack;

public class UndeadsZombie extends Character implements Attack {

    public UndeadsZombie(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 18 HP)");
        return character.setLife(character.getLife() - 18);
    }
}
