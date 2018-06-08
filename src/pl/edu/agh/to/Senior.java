package pl.edu.agh.to;

import java.util.HashSet;
import java.util.Set;

public class Senior extends Person implements Noble{
    protected Set<Person> vassals;

    public Senior(String name, String surname, String address, int troops) {
        super(name, surname, address, troops);
        this.vassals = new HashSet<>();
    }

    public void printVassals() {
        for(Person p: this.vassals) {
            System.out.println(String.format("%s %s", p.getName(), p.getSurname()));
        }
    }

    public Set<Person> getVassals() {
        return vassals;
    }

    public void addVassal(Person person) {
        if (this.vassals.size() < 7) {
            if(!this.vassals.contains(person)) {
                this.setTroops(this.getTroops() + person.getTroops());
            }
            this.vassals.add(person);
        } else {
            System.err.println("Senior already has 7 vassals.");
        }
    }

    public void dropVassal(Person person) {
        if (this.vassals.contains(person)) {
            this.setTroops(this.getTroops() - person.getTroops());
        }
        this.vassals.remove(person);
    }


}
