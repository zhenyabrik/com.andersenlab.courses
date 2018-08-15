package game.race.race.humans;

import game.Character;
import game.RaceType;
import game.skills.Buff;
import game.skills.Debuff;

public class HumansMagician extends Character implements Buff, Debuff {

    public HumansMagician(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double buff(Character character) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + character.setName(getName()) + " - (+10% HP)");
        return character.setLife((character.getLife()) + (character.getLife() * 0.10));
    }

    @Override
    public double debuff(Character character) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 4 HP)");
        return character.setLife(character.getLife() - 4);
    }
}
