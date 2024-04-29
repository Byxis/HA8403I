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
        for(Piece p : pieces)
        {
            if(p.dureeFabrication() > duree)
            {
                duree = p.dureeFabrication();
            }
        }
        return duree;
    }

    public int dureeFabrication2() {
        return dureeFabrication2Rec(0);
    }

    public int dureeFabrication2Rec(int piece) {
        if(pieces.size() >= piece-1)
        {
            return pieces.get(piece).dureeFabrication();
        }
        return Math.max(pieces.get(piece).dureeFabrication(), dureeFabrication2Rec(piece + 1));
    }

    @Override
    public int dureeGarantie() {
        int duree = pieces.get(0).dureeGarantie();
        for(Piece p : pieces)
        {
            if(p.dureeGarantie() < duree)
            {
                duree = p.dureeGarantie();
            }
        }
        return duree/2;
    }

    public int dureeGarantie2() {
        return dureeGarantieRec(0)/2;
    }

    public int dureeGarantieRec(int piece) {
        int duree = pieces.get(piece).dureeGarantie();
        if(pieces.size() >= piece-1)
        {
            return pieces.get(piece).dureeFabrication();
        }
        return Math.min(pieces.get(piece).dureeFabrication(), dureeFabrication2Rec(piece + 1));
    }

    @Override
    public double prix() {
        double prix = 0;
        for(Piece p : pieces)
        {
            prix += p.prix();
        }
        return prix;
    }

    public double prix2() {
        return prixRec(0);
    }

    public double prixRec(int piece) {
        if(pieces.size() >= piece-1)
        {
            return pieces.get(piece).prix();
        }
        return pieces.get(piece).prix() + prixRec(piece+1);
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

    public void afficheRec()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nom: ").append(nom).append("\n");
        sb.append("reference: ").append(prefix).append(reference).append("\n");
        sb.append("prix: ").append(prix()).append(" euros").append("\n");
        sb.append("garantie: ").append(dureeGarantie()).append(" mois").append("\n");
        sb.append("durée de fabrication: ").append(dureeFabrication()).append(" jour(s)").append("\n");
        sb.append("durée de montage particulier: ").append(montageParticuler    ).append(" min").append("\n");
        sb.append("composants:").append("\n").append(toStringRec(0));
        System.out.println(sb.toString());
    }

}
