package pl.edu.agh.to;

import java.util.HashSet;
import java.util.Set;

public class Kingdom {
    private King king;

    public Kingdom(King king) {
        this.king = king;
    }

    public King getKing() {
        return king;
    }

    public void printPeople() {
        System.out.println(String.format("King of kingdom: %s %s", this.king.getName(), this.king.getSurname()));
        king.printVassals();
    }
}
