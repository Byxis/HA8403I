package TP4.partie2;

public class Lettre extends ObjetPostal {

    private boolean isUrgent;

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
        StringBuilder sb = new StringBuilder("Lettre ");
        sb.append(super.getCodePostal()).append("/");
        sb.append(super.getDestination()).append("/");
        sb.append(super.getRecommendation()).append("/");
        sb.append(this.isUrgent());
        return sb.toString();
    }

    public boolean isUrgent()
    {
        return isUrgent;
    }
}
