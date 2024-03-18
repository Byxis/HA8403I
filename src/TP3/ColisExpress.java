package TP3;

import java.time.LocalDate;

public class ColisExpress extends Colis {

    private static int nombreColisExpress;
    private final int numColisExpress;
    private final LocalDate dateEnvoie;
    private final boolean emballeParLaponie;

    public ColisExpress(String ori, String des, int codeP, double poids
            , double volume, Recommendation taux, String contenu
            , double valeur, LocalDate dateEnvoie, boolean emballe)
    {
        super(ori, des, codeP, poids, volume, taux, contenu, valeur);
        assert poids > 30000 : "Le poids doit etre inférieur à 30kg";
        numColisExpress = nombreColisExpress++;
        this.dateEnvoie = dateEnvoie;
        this.emballeParLaponie = emballe;
    }


    @Override
    public double tarifAff() {
        return this.isEmballeParLaponie() ? 30 : 33;
    }

    @Override
    public String toString() {
        String sb = "Colis Express " + super.getCodePostal() + "/" +
                super.getDestination() + "/" +
                super.getRecommendation() + "/" +
                super.getVolume() + "/" +
                super.getValeur() + "/" +
                super.getPoids() + "/" +
                this.getNumColisExpress();
        return sb;
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
