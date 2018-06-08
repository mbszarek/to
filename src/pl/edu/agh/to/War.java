package pl.edu.agh.to;


import java.util.Random;

public class War {
    private final Person p1;
    private final Person p2;

    public War(Person p1, Person p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public Person getResult() {
        if (this.p1.getTroops() > this.p2.getTroops()) {
            return this.p1;
        } else if (this.p2.getTroops() > this.p1.getTroops()) {
            return this.p2;
        } else {
            if ((new Random()).nextDouble() > 0.5) {
                return this.p1;
            }
            return this.p2;
        }
    }
}
