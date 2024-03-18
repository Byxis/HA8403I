package TP5.exo2;

public class Abonne extends Personne{

    static int nextNumber = 0;
    int num;

    public Abonne(String nom, String prenom, int age) {
        super(nom, prenom, age);
        assert(age >= 18): "Should be 18 or +";
        nextNumber++;
        num = nextNumber;
    }
}
