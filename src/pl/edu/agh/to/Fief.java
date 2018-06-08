package pl.edu.agh.to;

public class Fief {
    private int wealth;
    private final FiefType type;

    public Fief(int wealth, FiefType type) {
        this.wealth = wealth;
        this.type = type;
    }

    public FiefType getType() {
        return type;
    }

    public int getWealth() {

        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }
}
