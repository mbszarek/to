package pl.edu.agh.to;

public final class King extends Senior implements Noble{
    public King(String name, String surname, String address, int troops) {
        super(name, surname, address, troops);
    }

    @Override
    public void addVassal(Person person) {
        if(!this.vassals.contains(person)) {
            this.setTroops(this.getTroops() + person.getTroops());
        }
        this.vassals.add(person);
    }

    @Override
    public void dropVassal(Person person) {
        if (this.vassals.contains(person)) {
            this.setTroops(this.getTroops() - person.getTroops());
        }
        this.vassals.remove(person);
    }

}
