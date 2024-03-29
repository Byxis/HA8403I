package TP6;

import java.util.ArrayList;

public abstract class Piece {

    private String suffixe;
    private String nom;
    private final ArrayList<PieceComposite> piecesComposite = new ArrayList<>();

    public Piece()
    {
        this.suffixe = "";
        this.nom = "";
    }

    public Piece(String suf, String n)
    {
        this.suffixe = suf;
        this.nom = n;
    }

    public String getSuffixe() {
        return suffixe;
    }

    public void setSuffixe(String suffixe) {
        this.suffixe = suffixe;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom()
    {
        this.nom = nom;
    }

    public abstract double prix();

    public abstract double dureeGarantie();

    public abstract double dureeFabrication();

    public abstract String prefixe();

    public String reference()
    {
        return prefixe() + " " + getSuffixe();
    }

    public String fiche()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getNom()).append(" ");
        sb.append(reference()).append(" ");
        sb.append(prix()).append(" ");
        sb.append(dureeGarantie()).append(" ");
        sb.append(dureeFabrication());
        return sb.toString();
    }
}
