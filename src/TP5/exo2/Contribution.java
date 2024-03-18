package TP5.exo2;

public class Contribution {

    private final Personne author;
    private final NoticeBiblio ouvrage;
    private final String role;

    public Contribution(Personne author, NoticeBiblio ouvrage, String role)
    {
        this.author = author;
        this.ouvrage = ouvrage;
        this.role = role;
    }
}
