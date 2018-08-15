package game.race.race.orcs;

import game.Character;
import game.RaceType;
import game.skills.Attack;
import game.skills.Shot;

public class OrcsArcher extends Character implements Attack, Shot {

    public OrcsArcher(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Удар клинком от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 2 HP)");
        return character.setLife(character.getLife() - 2);
    }

    @Override
    public double shot(Character character) {
        System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 3 HP)");
        return character.setLife(character.getLife() - 3);
    }
}
