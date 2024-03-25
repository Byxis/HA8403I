package TP5.exo3;

import java.time.LocalDate;

public class Mariage extends Contrat{

    private String nomMairie;
    private String nomCelebreur;

    public Mariage(LocalDate dateDebut, String nomMairie, String nomCelebreur) {
        super(dateDebut);
        this.nomMairie = nomMairie;
        this.nomCelebreur = nomCelebreur;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Mariage,debut=").append(super.dateDebut);
        if(isfinished())
        {
            sb.append(",fin=").append(super.dateFin);
        }
        sb.append(",mairie=").append(nomMairie);
        sb.append(",celebreur").append(nomCelebreur);
        return sb.toString();
    }

}
