package TP6V2;

public class main {

    public static void main(String[] args)
    {
        PieceEnKit chaise = new PieceEnKit("chaise", "04", 5);

        PieceDeBase visse = new PieceDeBase("visse", "01", 0.5, 1, 1);
        PieceDeBase clou = new PieceDeBase("clou", "02", 0.3, 1, 1);
        PieceDeBase planche = new PieceDeBase("planche", "03", 3, 2, 2);
        //clou.affiche();

        chaise.ajoute(visse);
        chaise.ajoute(clou);
        chaise.ajoute(planche);
        //chaise.affiche();

        PieceEnKit chaise2 = new PieceEnKit("chaise2", "05", 5);
        chaise2.ajoute(chaise);
        chaise2.ajoute(chaise);
        chaise2.ajoute(clou);
        chaise2.afficheRec();
    }
}
