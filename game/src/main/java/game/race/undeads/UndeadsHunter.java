package game.race.race.undeads;

import game.Character;
import game.RaceType;
import game.skills.Attack;
import game.skills.Shot;

public class UndeadsHunter extends Character implements Attack, Shot {

    public UndeadsHunter(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 2 HP)");
        return character.setLife(character.getLife() - 2);
    }

    @Override
    public double shot(Character character) {
        System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 4 HP)");
        return character.setLife(character.getLife() - 4);
    }
}
