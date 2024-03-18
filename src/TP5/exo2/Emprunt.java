package TP5.exo2;

import java.time.LocalDate;

public class Emprunt {

    private Abonne abonne;
    private Exemplaire exemplaire;

    private LocalDate dateEmprunt;
    private LocalDate dateRetour;

    public Emprunt(Abonne abonne, Exemplaire exemplaire, LocalDate dateEmprunt, LocalDate dateRetour)
    {
        this.abonne = abonne;
        this.exemplaire = exemplaire;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    public Abonne getAbonne() {
        return abonne;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }
}
