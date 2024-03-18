package TP3;

import TP3.ObjetPostal;

public class Lettre extends ObjetPostal {

    private final boolean isUrgent;

    public Lettre(String ori, String des, int codeP, double poids
        , double volume, Recommendation taux, boolean isUrgent)
    {
        super(ori, des, codeP, poids, volume, taux);
        this.isUrgent = isUrgent;
    }


    @Override
    public double tarifAff() {
        double tarif = 0.5;
        switch(getRecommendation())
        {
            case Un:
                tarif += 0.5;
                break;
            case Deux:
                tarif += 1.5;
                break;
        }
        return this.isUrgent() ? tarif + 0.3 : tarif;
    }

    @Override
    public double tarifRemb() {
        double tarif = 0;
        switch(getRecommendation())
        {
            case Un:
                tarif = 1.5;
                break;
            case Deux:
                tarif = 15;
                break;
        }
        return tarif;
    }

    @Override
    public String toString() {
        String sb = "Lettre " + super.getCodePostal() + "/" +
                super.getDestination() + "/" +
                super.getRecommendation() + "/" +
                this.isUrgent();
        return sb;
    }

    public boolean isUrgent()
    {
        return isUrgent;
    }
}
