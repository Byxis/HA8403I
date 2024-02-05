package TP2;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
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
    }

}
