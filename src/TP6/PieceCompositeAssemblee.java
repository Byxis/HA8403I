package TP6;

public class PieceCompositeAssemblee extends PieceComposite {

    private double prixMontageAtelier;
    private double dureeMontageAtelier;
    private static String prefixe = "02";
    private static double bonusGarantie = 6;

    public PieceCompositeAssemblee()
    {
        super();
        this.prixMontageAtelier = 0;
        this.dureeMontageAtelier = 0;
    }

    @Override
    public String prefixe() {
        return prefixe;
    }

    public PieceCompositeAssemblee(String suf, String n, double pma, double dma)
    {
        super(suf,n);
        this.prixMontageAtelier = pma;
        this.dureeMontageAtelier = dma;
    }

    public double getPrixMontageAtelier() {
        return prixMontageAtelier;
    }

    public void setPrixMontageAtelier(double prixMontageAtelier) {
        this.prixMontageAtelier = prixMontageAtelier;
    }

    public double getDureeMontageAtelier() {
        return dureeMontageAtelier;
    }

    public void setDureeMontageAtelier(double dureeMontageAtelier) {
        this.dureeMontageAtelier = dureeMontageAtelier;
    }

    @Override
    public double prix()
    {
        return super.prix()+prixMontageAtelier;
    }

    @Override
    public double dureeGarantie()
    {
        return super.dureeGarantie()+bonusGarantie;
    }

    @Override
    public double dureeFabrication()
    {
        return super.dureeFabrication()+dureeMontageAtelier;
    }

    @Override
    public String fiche()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.fiche()).append(" ");
        sb.append(dureeMontageAtelier).append(" ");
        sb.append(prixMontageAtelier).append(" ");
        sb.append(listeComposants());
        return sb.toString();
    }
}
