package TP5.exo3;

import java.time.LocalDate;

public class Contrat {

    LocalDate dateDebut;
    LocalDate dateFin;

    public Contrat(LocalDate dateDebut)
    {
        this.dateDebut = dateDebut;
    }

    public void finirContrat()
    {
        this.dateFin = LocalDate.now();
    }

    public boolean isfinished()
    {
        return dateFin != null;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Contrat,debut=").append(dateDebut);
        if(isfinished())
        {
            sb.append(",fin=").append(dateFin);
        }
        return sb.toString();
    }

}
