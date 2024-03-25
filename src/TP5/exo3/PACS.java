package TP5.exo3;

import java.time.LocalDate;

public class PACS extends Contrat{

    private String nomTribunal;

    public PACS(LocalDate dateDebut, String nomTribunal) {
        super(dateDebut);
        this.nomTribunal = nomTribunal;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("PACS,debut=").append(super.dateDebut);
        if(isfinished())
        {
            sb.append(",fin=").append(super.dateFin);
        }
        sb.append(",nomTribunal=").append(nomTribunal);
        return sb.toString();
    }

}
