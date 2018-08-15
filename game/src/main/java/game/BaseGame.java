package game;


import game.race.race.elfs.ElfArcher;
import game.race.race.humans.HumansCrossbowman;

public class BaseGame {

    public static void main(String[] args) {
        ElfArcher elfArcher = new ElfArcher("ElfArcher", false, game.RaceType.Elfs);
        HumansCrossbowman humansCrossbowman = new HumansCrossbowman("HumansCrossbowman", false, game.RaceType.Humans);


        System.out.println(humansCrossbowman.getLife());
        elfArcher.attack(humansCrossbowman);
        System.out.println(humansCrossbowman.getLife());

        elfArcher.isBuffed();



//        while (elfArcher.isLive() == true && humansCrossbowman.isLive() == true) {
//            System.out.println(humansCrossbowman.attackShotArrow(elfArcher));
//            System.out.println(elfArcher.attackShotArrow(humansCrossbowman));
//        }
//        if (elfArcher.getHealht() <= 0) {
//            System.err.println("Умер - " + elfArcher.getName());
//        }
//        else {
//            System.err.println("Умер - " + humansCrossbowman.getName());
//        }



    }
}
