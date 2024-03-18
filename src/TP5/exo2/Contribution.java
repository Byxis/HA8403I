package TP5.exo2;

public class Contribution {

    private Personne author;
    private NoticeBiblio ouvrage;
    private String role;

    public Contribution(Personne author, NoticeBiblio ouvrage, String role)
    {
        this.author = author;
        this.ouvrage = ouvrage;
        this.role = role;
    }
}
