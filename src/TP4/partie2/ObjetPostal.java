package TP4.partie2;

public abstract class ObjetPostal {

    private final String origin;
    private final String destination;
    private final int codePostal;
    private final double poids; // en gramme
    private final double volume; // en m3
    private final Recommendation taux;

    public abstract double tarifAff();
    public abstract double tarifRemb();
    public abstract String toString();

    public ObjetPostal(String ori, String des, int codeP, double poids
            , double volume, Recommendation taux)
    {
        this.origin = ori;
        this.destination = des;
        this.codePostal = codeP;
        this.poids = poids;
        this.volume = volume;
        this.taux = taux;
    }

    public Recommendation getRecommendation()
    {
        return taux;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public double getPoids() {
        return poids;
    }

    public double getVolume() {
        return volume;
    }
}
