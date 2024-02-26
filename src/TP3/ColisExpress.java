package TP3;

import java.time.LocalDate;

public class ColisExpress extends Colis {

    private static int nombreColisExpress;
    private final int numColisExpress;
    private LocalDate dateEnvoie;
    private boolean emballeParLaponie;

    public ColisExpress(String ori, String des, int codeP, double poids
            , double volume, Recommendation taux, String contenu
            , double valeur, LocalDate dateEnvoie, boolean emballe)
    {
        super(ori, des, codeP, poids, volume, taux, contenu, valeur);
        assert poids > 30000 : "Le poids doit etre inférieur à 30kg";
        numColisExpress = nombreColisExpress;
        nombreColisExpress++;
        this.dateEnvoie = dateEnvoie;
        this.emballeParLaponie = emballe;

    }


    @Override
    public double tarifAff() {
        return this.isEmballeParLaponie() ? 30 : 33;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Colis Express ");
        sb.append(super.getCodePostal()).append("/");
        sb.append(super.getDestination()).append("/");
        sb.append(super.getRecommendation()).append("/");
        sb.append(super.getVolume()).append("/");
        sb.append(super.getValeur()).append("/");;
        sb.append(super.getPoids()).append("/");;
        sb.append(this.getNumColisExpress());;
        return sb.toString();
    }

    public int getNumColisExpress() {
        return numColisExpress;
    }

    public LocalDate getDateEnvoie() {
        return dateEnvoie;
    }

    public boolean isEmballeParLaponie() {
        return emballeParLaponie;
    }
}
