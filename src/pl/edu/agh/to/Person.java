package pl.edu.agh.to;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private final String name;
    private final String surname;
    private String address;
    private Set<Fief> fiefs;
    private int troops;

    public Person(String name, String surname, String address, int troops) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.fiefs = new HashSet<>();
        this.troops = troops;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTroops() {
        return troops;
    }

    public Set<Fief> getFiefs() {
        return fiefs;
    }

    public void setTroops(int troops) {
        if (troops > 0) {
            this.troops = troops;
        } else {
            System.err.println("Amount of troops cannot be a negative number.");
        }
    }

    public void printFiefs() {
        System.out.println(String.format("Fiefs of %s %s:", this.name, this.surname));
        for(Fief f: this.fiefs) {
            System.out.println(String.format("Fief: %s %d", f.getType().toString(), f.getWealth()));
        }
    }


}
