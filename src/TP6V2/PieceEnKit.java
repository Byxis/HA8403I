package TP6V2;

public class PieceEnKit extends PieceComposite {

    private String prefix = "01";
    private int montageParticuler;

    public PieceEnKit(String nom, String ref, int montageParticuler) {
        super(nom, ref);
        this.montageParticuler = montageParticuler;
    }


    @Override
    public int dureeFabrication() {
        int duree = pieces.get(0).dureeFabrication();
        //on pourrait le faire en 100% recursif
        for(Piece p : pieces)
        {
            if(p.dureeFabrication() > duree)
            {
                duree = p.dureeFabrication();
            }
        }
        return duree;
    }

    @Override
    public int dureeGarantie() {
        int duree = pieces.get(0).dureeGarantie();
        //on pourrait le faire en 100% recursif
        for(Piece p : pieces)
        {
            if(p.dureeGarantie() < duree)
            {
                duree = p.dureeGarantie();
            }
        }
        return duree/2;
    }

    @Override
    public double prix() {
        //on pourrait le faire en 100% recursif
        double prix = 0;
        for(Piece p : pieces)
        {
            prix += p.prix();
        }
        return prix;
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
        sb.append("durée de montage particulier: ").append(montageParticuler    ).append(" min").append("\n");
        sb.append("composants:").append("\n").append(toString());
        System.out.println(sb.toString());
    }

}
