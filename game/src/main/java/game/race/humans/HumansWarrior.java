package game.race.race.humans;

import game.Character;
import game.RaceType;
import game.skills.Attack;

public class HumansWarrior extends Character implements Attack {

    public HumansWarrior(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 18 HP)");
        return character.setLife(character.getLife() - 18);
    }
}
