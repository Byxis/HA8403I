package TP6V2;

public abstract class Piece {

    protected String prefix = "";
    protected String nom;
    protected String reference;

    public Piece(String nom, String ref)
    {
        this.nom = nom;
        this.reference = ref;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nom).append(" - ").append(prefix).append(reference);
        return sb.toString();
    }

    public void affiche()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nom: ").append(nom).append("\n");
        sb.append("reference: ").append(prefix).append(reference).append("\n");
        System.out.println(sb.toString());
    }

    public abstract int dureeFabrication();

    public abstract int dureeGarantie();

    public abstract double prix();

}
