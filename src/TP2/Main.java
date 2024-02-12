package TP2;

import TP2.TD.Etudiant;
import TP2.TD.Pays;

import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {
        /*
        System.out.println("Création d'un rectangle");
        Scanner clavier = new Scanner(System.in);
        System.out.println("Longueur : ");
        double longueur = clavier.nextDouble();
        System.out.println("Largeur : ");
        double largeur = clavier.nextDouble();
        System.out.println("Position X : ");
        int x = clavier.nextInt();
        System.out.println("Position Y : ");
        int y = clavier.nextInt();
        System.out.println("Couleur (Rouge par défaut) : ");
        String couleur = clavier.next();

        Rectangle r = new Rectangle(longueur, largeur, Couleur.valueOf(couleur), x, y);

        System.out.println(r);
        */

        Etudiant et = new Etudiant(LocalDate.of(2004, 4, 27), "1_SALUT", Pays.Francais, 15, 19, 18);
        et.saisie();
        System.out.println(et.ligneResultats());
        System.out.println(et);
    }

}
