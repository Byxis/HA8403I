package TP6;

import java.util.ArrayList;

public abstract class PieceComposite extends Piece {

    private final ArrayList<Piece> pieces = new ArrayList<Piece>();

    public PieceComposite()
    {
        super();
    }

    public PieceComposite(String suf, String n)
    {
        super(suf, n);
    }

    public void ajoute(Piece p)
    {
        pieces.add(p);
    }

    @Override
    public double prix()
    {
        double prix = 0;
        for(Piece p : pieces)
        {
            prix += p.prix();
        }
        return prix;
    }

    @Override
    public double dureeGarantie()
    {
        if(pieces.isEmpty()) return 0;

        double dureeGarantie = pieces.get(0).dureeGarantie();
        for(Piece p : pieces)
        {
            if(p.dureeGarantie() < dureeGarantie)
            {
                dureeGarantie = p.dureeGarantie();
            }
        }
        return dureeGarantie;
    }

    @Override
    public double dureeFabrication()
    {
        if(pieces.isEmpty()) return 0;

        double dureeFabrication = pieces.get(0).dureeFabrication();
        for(Piece p : pieces)
        {
            if(p.dureeFabrication() < dureeFabrication)
            {
                dureeFabrication = p.dureeFabrication();
            }
        }
        return dureeFabrication;
    }

    public String listeComposants()
    {
        StringBuilder sb = new StringBuilder();
        for(Piece p : pieces)
        {
            sb.append(p.getNom());
            sb.append(" ");
        }
        return sb.toString();
    }

}
