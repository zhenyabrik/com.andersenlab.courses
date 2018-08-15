package game.race.race.elfs;

import game.RaceType;
import game.skills.Attack;
import game.Character;
import game.skills.Shot;

public class ElfArcher extends Character implements Attack, Shot {

    public ElfArcher(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 7 HP)");
        return character.setLife(character.getLife() - 7);
    }

    @Override
    public double shot(Character character) {
        System.out.println("Атака противника от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 3 HP)");
        return character.setLife(character.getLife() - 3);
    }


}
