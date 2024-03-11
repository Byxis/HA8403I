package TP5.exo1;

public class PromotionTest {
    public static void main(String[] args) {
/*Pour une forme de constructeur Etudiant(String nom, int anneeNaiss,
CodePays codePays,
double note1, double note2, double note3)*/
        Etudiant e1 = new Etudiant("Marie",1998, CodePays.Francais,18, 18, 18);
        System.out.println(e1);
        Etudiant e2 = new Etudiant("Jeanne", 1998, CodePays.Francais,14, 9, 16);
        System.out.println(e2);
        Etudiant e3 = new Etudiant("Sylvie", 1998, CodePays.Francais,7, 9, 10);
        System.out.println(e3);
        Etudiant e4 = new Etudiant("Esther", 1998, CodePays.Francais,7, 9, 5);
        System.out.println(e4);
        Etudiant e5 = new Etudiant("Astrid", 1998, CodePays.Francais,10, 10, 0);
        System.out.println(e5);
        Etudiant e6 = new Etudiant("Mohamed", 1998, CodePays.Etranger,18, 18, 18);
        System.out.println(e5);
        Etudiant e7 = new Etudiant("Bjorg", 1998, CodePays.Etranger,18, 18, 18);
        System.out.println(e5);
        Promotion p = new Promotion("groupe PEIP",2022);
/* les instructions suivantes ne doivent pas pouvoir ^etre ex´ecut´ees
p.getEtudiants().add(e2);
p.getEtudiants().add(e2);
p.getEtudiants().add(e3);*/
// tester les cas limites (ici promotion vide)
        System.out.println("\n---PROMO VIDE----\n"+p.getEtudiants());
        System.out.println("\n---PROMO VIDE----\n"+p.moyenneGenerale());
        System.out.println("\n---PROMO VIDE----\n"+p.moyenneGenerale());
        System.out.println("\n---PROMO VIDE----\n"+p.recherche("Astrid"));
        System.out.println("\n---PROMO VIDE----\n"+p.recherche("astrid"));
        System.out.println("\n---PROMO VIDE Admis----\n"+p.admis());
        System.out.println("\n---FIN PROMO VIDE----\n");
// tester le cas g´en´eral
        p.inscrire(e1);p.inscrire(e2);
        p.inscrire(e2);// ne sera pas r´einscrit (pas de doublon)
        p.inscrire(e3);p.inscrire(e4);
        p.inscrire(e5);p.inscrire(e6);
        p.inscrire(e7);
        System.out.println("\n-------\n"+p.getEtudiants());
        System.out.println("\n-------\n"+p.moyenneGenerale());
        System.out.println("\n-------\n"+p.recherche("Astrid"));
        System.out.println("\n-------\n"+p.recherche("astrid"));
        System.out.println("\n---Admis----\n"+p.admis());
        System.out.println("\n---Etu Et. non francophone ----\n"+p.etuEtrangerNonFranco());
        System.out.println("\n---Majors ----\n"+p.majors());
    }
}