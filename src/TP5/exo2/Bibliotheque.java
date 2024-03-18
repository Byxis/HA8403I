package TP5.exo2;

import java.util.HashMap;

public class Bibliotheque {

    private final HashMap<String, NoticeBiblio> ouvrages = new HashMap<>();

    public Bibliotheque()
    {

    }

    public void Emprunt(String ISBN, Abonne abonne, int dureeJours)
    {
        if(!ouvrages.containsKey(ISBN))
        {
            System.out.println("Ce livre n'est pas disponible dans la bibliothèque.");
            return;
        }
        NoticeBiblio nbiblio = ouvrages.get(ISBN);

        if(nbiblio.getPublicCible() == PublicCible.Adulte && abonne instanceof AbonneMineur)
        {
            System.out.println("Vous êtes trop jeune pour ce livre.");
            return;
        }

        if(nbiblio.isAvailable())
        {
            System.out.println("Ce livre n'a plus d'exemplaire disponible dans la bibliothèque.");
            return;
        }

        if(nbiblio.emprunt(abonne, dureeJours))
        {
            System.out.println("Emprunt effectué avec succès.");
        }
        else
        {
            System.out.println("Une erreur est survenue pendant l'emprunt.");
        }
    }

    public void Retour(String ISBN, Abonne abonne)
    {
        if(!ouvrages.containsKey(ISBN))
        {
            System.out.println("Ce livre n'est pas disponible dans la bibliothèque.");
            return;
        }
        NoticeBiblio nbiblio = ouvrages.get(ISBN);
        if(!nbiblio.isEmprunte(abonne))
        {
            System.out.println("Vous n'avez pas emprunté ce livre.");
            return;
        }

        if(nbiblio.retour(abonne))
        {
            System.out.println("Retour effectué avec succès.");
        }
        else
        {
            System.out.println("Une erreur est survenue pendant le retour.");
        }

    }



}
