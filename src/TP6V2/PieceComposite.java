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
        //ici il faudrait faire du recursif pour afficher le bon nombre de tabulation
        for(Piece p : pieces)
        {
            sb.append("   ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public String toStringRec(int t)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(toStringRec2(1,0));

        return sb.toString();
    }

    public String toStringRec2(int t, int piece)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("   ".repeat(t));
        sb.append(super.toString()).append("\n");

        if(piece < pieces.size())
        {
            Piece p = pieces.get(piece);
            if(p instanceof PieceComposite pc)
            {
                sb.append(pc.toStringRec2(t+1,0));
                sb.append("\n");
                String str = toStringRec2B(t,piece+1);
                if(str.length() != 0 )
                {
                    sb.append(str);
                }
            }
            else
            {
                String str = toStringRec2B(t,piece+1);
                if(str.length() != 0 )
                {
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("   ".repeat(t+1));
                sb.append(p.toString());
            }
        }

        return sb.toString();
    }

    public String toStringRec2B(int t, int piece)
    {
        StringBuilder sb = new StringBuilder();

        if(piece < pieces.size())
        {
            Piece p = pieces.get(piece);
            if(p instanceof PieceComposite pc)
            {
                sb.append(pc.toStringRec2(t+1,0));
                sb.append("\n");
                String str = toStringRec2B(t,piece+1);
                if(str.length() != 0 )
                {
                    sb.append(str);
                }
            }
            else
            {
                String str = toStringRec2B(t,piece+1);
                if(str.length() != 0 )
                {
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("   ".repeat(t+1));
                sb.append(p.toString());
            }
        }

        return sb.toString();
    }

}
