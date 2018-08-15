package game.race.race.undeads;

import game.Character;
import game.RaceType;
import game.skills.Attack;
import game.skills.Buff;
import game.skills.Debuff;

public class UndeadsNecromancer extends Character implements Attack, Debuff {

    public UndeadsNecromancer(String name, boolean isBuffed, RaceType race) {
        super(name, isBuffed, race);
    }

    @Override
    public double attack(Character character) {
        System.out.println("Уменьшение силы урона: " + setName(getName()) + "на 50%");
        return character.setLife(character.getLife() - 5);
    }

//    System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + character.setName(getName()) + " - (+25% HP)");
//        return character.setLife((character.getLife()) + (character.getLife() * 0.25));

    @Override
    public double debuff(Character character) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + character.setName(getName()) + " - (урон 5 HP)");
        return character.setLife(character.getLife() - 5);
    }
}
