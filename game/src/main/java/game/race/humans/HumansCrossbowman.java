package game.race.race.humans;

import game.RaceType;
import game.skills.Attack;
import game.Character;
import game.skills.Shot;

public class HumansCrossbowman extends Character implements Attack, Shot {

    public HumansCrossbowman(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 3 HP)");
        return character.setLife(character.getLife() - 3);
    }

    @Override
    public double shot(Character character) {
        System.out.println("Выстрел из арбалета от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 5 HP)");
        return character.setLife(character.getLife() - 5);
    }
}
