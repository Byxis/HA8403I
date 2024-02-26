package TP3;

public class Colis extends ObjetPostal{

    private String contenu;
    private double valeur;

    public Colis(String ori, String des, int codeP, double poids
            , double volume, Recommendation taux, String contenu
            , double valeur)
    {
        super(ori, des, codeP, poids, volume, taux);
        this.contenu = contenu;
        this.valeur = valeur;
    }

    @Override
    public double tarifAff() {
        double tarif = 2;
        switch(getRecommendation())
        {
            case Un:
                tarif+=.5;
                break;
            case Deux:
                tarif +=1.5;
                break;
        }
        return getVolume() > (double) 1 /8 ? tarif+3 : tarif;
    }

    @Override
    public double tarifRemb() {
        double tarif = 0;
        switch(getRecommendation())
        {
            case Un:
                tarif = 0.1*valeur;
                break;
            case Deux:
                tarif = 0.5*valeur;
                break;
        }
        return tarif;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Colis ");
        sb.append(super.getCodePostal()).append("/");
        sb.append(super.getDestination()).append("/");
        sb.append(super.getRecommendation()).append("/");
        sb.append(super.getVolume()).append("/");
        sb.append(this.getValeur());
        return sb.toString();
    }

    public String getContenu() {
        return contenu;
    }

    public double getValeur() {
        return valeur;
    }
}
