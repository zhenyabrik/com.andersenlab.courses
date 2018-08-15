package game.race.race.orcs;

import game.Character;
import game.RaceType;
import game.skills.Buff;
import game.skills.Debuff;

public class OrcsShaman extends Character implements Buff, Debuff {

    public OrcsShaman(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double buff(Character character) {
        System.out.println("Улучшение: " + setName(getName()) + "персонажа: " + character.setName(getName()) + " - (добавлено жизни 5 HP)");
        return character.setLife(character.getLife() + 5);
    }

    @Override
    public double debuff(Character character) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 6 HP)");
        return character.setLife(character.getLife() - 6);
    }
}
