package game.race.race.elfs;

import game.Character;
import game.RaceType;
import game.skills.Attack;

public class ElfWarrior extends Character implements Attack {


    public ElfWarrior(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 15 HP)");
        return character.setLife(character.getLife() - 15);
    }
}
