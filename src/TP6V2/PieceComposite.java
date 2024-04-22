package TP6V2;

import java.util.ArrayList;

public abstract class PieceComposite extends Piece {

    protected ArrayList<Piece> pieces = new ArrayList<Piece>();

    public PieceComposite(String nom, String ref) {
        super(nom, ref);
    }

    public void ajoute(Piece p)
    {
        pieces.add(p);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder(super.toString());
        for(Piece p : pieces)
        {
            sb.append("   ").append(p.nom).append(" - ").append(p.prefix).append(p.reference).append("\n");
        }
        return sb.toString();
    }

}
