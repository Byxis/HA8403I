package TP5.exo2;

import java.util.ArrayList;

public class Personne {

    private final String nom;
    private final String prenom;
    private final int age;

    private final ArrayList<Contribution> contributions = new ArrayList<>();

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
