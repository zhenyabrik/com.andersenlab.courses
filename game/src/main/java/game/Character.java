package game;

public abstract class Character {

    private double life = 100;
    private String name;
    private boolean isBuffed;
    protected RaceType raceType;

    public Character(String name, boolean buff, RaceType raceType) {
        this.name = name;
        this.isBuffed = buff;
        this.raceType = raceType;
    }

    public double getLife() {
        return life;
    }

    public double setLife(double life) {
        this.life = life;
        return life;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public boolean isBuffed() {
        return isBuffed;
    }

    public boolean setBuffed(boolean buffed) {
        isBuffed = buffed;
        return buffed;
    }

    public boolean isAlive () {
        return life > 0;
    }
}
