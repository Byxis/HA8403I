package TP6;

public class PieceDeBase extends Piece{

    private double prix;
    private double dureeGarantie;
    private double dureeFabrication;
    private static String prefixe = "00";

    public PieceDeBase()
    {
        super();
        this.prix = 0;
        this.dureeGarantie = 0;
        this.dureeFabrication = 0;
    }

    public PieceDeBase(String suf, String n, double p, double dg, double df)
    {
        super(suf,n);
        this.prix = p;
        this.dureeGarantie = dg;
        this.dureeFabrication = df;
    }


    @Override
    public double prix() {
        return this.prix;
    }

    @Override
    public double dureeGarantie() {
        return this.dureeGarantie;
    }

    @Override
    public double dureeFabrication() {
        return this.dureeFabrication;
    }

    @Override
    public String prefixe() {
        return prefixe;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(double dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public double getDureeFabrication() {
        return dureeFabrication;
    }

    public void setDureeFabrication(double dureeFabrication) {
        this.dureeFabrication = dureeFabrication;
    }
}
