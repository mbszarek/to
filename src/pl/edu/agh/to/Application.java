package pl.edu.agh.to;

public class Application {
    public static void main(String[] args) {
        Kingdom firstKingdom = new Kingdom(new King("Wojciech", "Koza", "Kawiory 20", 1000));
        Kingdom secondKingdom = new Kingdom(new King("Kasper", "Kadzielawa", "MS AGH", 500));
        firstKingdom.getKing().addVassal(new Senior("Mateusz", "Szarek", "Armii Krajowej", 500));
        Person p = (new War(firstKingdom.getKing(), secondKingdom.getKing())).getResult();
        System.out.println(String.format("Winner of war is %s %s", p.getName(), p.getSurname()));
    }
}
