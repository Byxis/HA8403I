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
        sb.append("\n");
        //ici il faudrait faire du reccursif pour afficher le bon nombre de tabulation
        for(Piece p : pieces)
        {
            sb.append("   ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }

}
