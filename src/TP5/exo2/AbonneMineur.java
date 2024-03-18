package TP5.exo2;

public class AbonneMineur extends Abonne{

    public AbonneMineur(String nom, String prenom, int age) {
        super(nom, prenom, age);
        assert(age < 18): "Should be less than 18";
        nextNumber++;
        super.num = nextNumber;
    }
}
