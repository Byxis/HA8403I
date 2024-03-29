package TP6;

public class PieceCompositeEnKit extends PieceComposite{

    private double dureeMontagearticulier;
    private String notice;
    private static String prefixe = "01";

    public PieceCompositeEnKit()
    {
        super();
    }

    public PieceCompositeEnKit(String suf, String n, double dmp, String not)
    {
        super(suf,n);
        this.dureeMontagearticulier = dmp;
        this.notice = not;
    }

    @Override
    public String prefixe() {
        return prefixe;
    }

    public double getDureeMontagearticulier() {
        return dureeMontagearticulier;
    }

    public void setDureeMontagearticulier(double dureeMontagearticulier) {
        this.dureeMontagearticulier = dureeMontagearticulier;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public double dureeGarantie()
    {
        return super.dureeGarantie()/2;
    }

    @Override
    public String fiche()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.fiche()).append(" ");
        sb.append(dureeMontagearticulier).append(" ");
        sb.append(listeComposants()).append(" ");
        return sb.toString();
    }


}
