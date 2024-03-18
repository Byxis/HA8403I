package TP3;

public abstract class ObjetPostal {

    private String origin;
    private String destination;
    private int codePostal;
    private double poids; // en gramme
    private double volume; // en m3
    private Recommendation taux;

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

    public abstract double tarifAff();
    public abstract double tarifRemb();
    public abstract String toString();

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
