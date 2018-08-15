package game.race.race.elfs;

import game.Character;
import game.RaceType;
import game.skills.Buff;
import game.skills.Debuff;

public class ElfMagician extends Character implements Buff, Debuff {

    public ElfMagician(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double buff(Character character) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + character.setName(getName()) + " - (+25% HP)");
        return character.setLife((character.getLife()) + (character.getLife() * 0.25));
    }

    @Override
    public double debuff(Character character) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 10 HP)");
        return character.setLife(character.getLife() - 10);
    }
}
