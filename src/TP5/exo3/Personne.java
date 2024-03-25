package TP5.exo3;

public class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString()
    {
        return "nom=" + nom + ",prenom="+prenom;
    }
}
