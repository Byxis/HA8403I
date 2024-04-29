package TP6V2;

public class PieceAssemblee extends PieceComposite {

    private String prefix = "02";
    private int prixMontage;
    private int dureeMontage;


    public PieceAssemblee(String nom, String ref, int prixMontage) {
        super(nom, ref);
        this.prixMontage = prixMontage;
    }

    @Override
    public int dureeFabrication() {
        int fabrication = pieces.get(0).dureeFabrication();
        //on pourrait le faire en 100% recursif (déjà fait ailleurs)

        for(Piece p : pieces)
        {
            if(p.dureeFabrication() > fabrication)
            {
                fabrication = p.dureeFabrication();
            }
        }
        return fabrication+dureeMontage;
    }

    @Override
    public int dureeGarantie() {
        int garantie = pieces.get(0).dureeGarantie();
        //on pourrait le faire en 100% recursif (déjà fait ailleurs)

        for(Piece p : pieces)
        {
            if(p.dureeGarantie() < garantie)
            {
                garantie = p.dureeGarantie();
            }
        }
        return garantie+6;
    }

    @Override
    public double prix() {
        double prix = 0;
        //on pourrait le faire en 100% recursif (déjà fait ailleurs)
        for(Piece p : pieces)
        {
            prix += p.prix();
        }
        return prix+prixMontage;
    }

    @Override
    public void affiche()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nom: ").append(nom).append("\n");
        sb.append("reference: ").append(prefix).append(reference).append("\n");
        sb.append("prix: ").append(prix()).append(" euros").append("\n");
        sb.append("garantie: ").append(dureeGarantie()).append(" mois").append("\n");
        sb.append("durée de fabrication: ").append(dureeFabrication()).append(" jour(s)").append("\n");
        sb.append("durée de montage atelier: ").append(dureeMontage).append(" jour(s)").append("\n");
        sb.append("prix montage: ").append(dureeMontage).append("\n");
        sb.append("composants:").append("\n").append(toString());
        System.out.println(sb.toString());
    }
}
