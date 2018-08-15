package game.race.race.orcs;

import game.Character;
import game.RaceType;
import game.skills.Attack;

public class OrcsGoblin extends Character implements Attack {

    public OrcsGoblin(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Атака дубинкой от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 20 HP)");
        return character.setLife(character.getLife() - 20);
    }
}
