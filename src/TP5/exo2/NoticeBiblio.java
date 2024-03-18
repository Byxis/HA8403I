package TP5.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class NoticeBiblio {

    private final String ISBN;
    private final String title;
    private String subtitle = "";
    private final PublicCible publicCible;
    private final ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
    private final ArrayList<Emprunt> emprunts = new ArrayList<Emprunt>();

    public NoticeBiblio(String ISBN, String title, String subtitle, PublicCible publicCible)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.subtitle = subtitle;
        this.publicCible = publicCible;
    }

    public boolean emprunt(Abonne abonne, int nbJour)
    {
        if(!isAvailable()) return false;
        Exemplaire exemplaireEmprunte = null;
        for(Exemplaire e : exemplaires)
        {
            if(e.isAvailable()) exemplaireEmprunte = e;
        }
        if(exemplaireEmprunte == null) return false;
        exemplaireEmprunte.setEmprunte(true);
        Emprunt emprunt = new Emprunt(abonne, exemplaireEmprunte, LocalDate.now(), LocalDate.now().plusDays(nbJour));
        emprunts.add(emprunt);
        return true;
    }

    public boolean isEmprunte(Abonne abonne)
    {
        for(Emprunt e : emprunts)
        {
            if(e.getAbonne() == abonne)
            {
                return true;
            }
        }
        return false;
    }

    public boolean retour(Abonne abonne)
    {
        Emprunt ep = null;
        for(Emprunt emprunt : emprunts)
        {
            if(ep.getAbonne() == abonne)
            {
                ep = emprunt;
                break;
            }
        }
        Exemplaire ex = null;
        for(Exemplaire exemplaire : exemplaires)
        {
            if(exemplaire == ep.getExemplaire())
            {
                ex = exemplaire;
                break;
            }
        }
        if(ex == null) return false;
        ex.setEmprunte(false);
        emprunts.remove(ex);
        return true;
    }

    public void addExemplaire(Exemplaire exemplaire)
    {
        exemplaires.add(exemplaire);
    }

    public boolean isAvailable()
    {
        for(Exemplaire e : exemplaires)
        {
            if(e.isAvailable())
                return true;
        }
        return false;
    }

    public PublicCible getPublicCible() {
        return publicCible;
    }
}
