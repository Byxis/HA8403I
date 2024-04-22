package TP6V2;

public class PieceDeBase extends Piece {

    private String prefix = "00";
    private double prix;
    private int garantie;
    private int fabrication;

    public PieceDeBase(String nom, String ref, double prix, int garantie, int fabrication) {
        super(nom, ref);

        this.prix = prix;
        this.garantie = garantie;
        this.fabrication = fabrication;
    }

    @Override
    public void affiche()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nom: ").append(nom).append("\n");
        sb.append("reference: ").append(prefix).append(reference).append("\n");
        sb.append("prix: ").append(prix()).append(" euros").append("\n");
        sb.append("garantie: ").append(dureeGarantie()).append(" mois").append("\n");
        sb.append("durée de fabrication: ").append(dureeFabrication()).append(" jour(s)").append("\n");
        System.out.println(sb.toString());
    }

    @Override
    public int dureeFabrication() {
        return fabrication;
    }

    @Override
    public int dureeGarantie() {
        return  garantie;
    }

    @Override
    public double prix() {
        return prix;
    }
}
