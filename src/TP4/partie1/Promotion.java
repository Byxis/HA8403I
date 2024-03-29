package TP4.partie1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Promotion {

    private String name;
    private final ArrayList<Etudiant> etudiants = new ArrayList<>();
    private int annee;

    /*---------------------- Constructor -----------------------*/

    public Promotion()
    {
        annee = -1;
    }

    public Promotion(String name, int annee)
    {

        this.name = name;
        this.annee=annee;
    }

    /*---------------------- Constructor -----------------------*/


    /*----------------------- Getters ------------------------*/

    public ArrayList<Etudiant> getEtudiants()
    {
        return (ArrayList<Etudiant>) Collections.unmodifiableList(this.etudiants);
    }

    public Etudiant getEtudiant(int id)
    {
        return this.etudiants.get(id);
    }

    public int getPromoSize()
    {
        return this.etudiants.size();
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*----------------------- Getters ------------------------*/

    /*----------------------- Functions ------------------------*/

    public void inscrire(Etudiant etudiant)
    {
        if(!this.etudiants.contains(etudiant))
            this.etudiants.add(etudiant);
    }

    public double moyenneGenerale()
    {
        double moyenne = 0;

        for(Etudiant e : this.etudiants)
        {
            moyenne += e.calculMoyenne();
        }
        if(getPromoSize() == 0)
            return -1;
        return moyenne/getPromoSize();
    }

    public void afficheResultats()
    {
        Etudiant.templateResultats();
        for(Etudiant e : this.etudiants)
        {
            e.ligneResultats();
        }
    }

    public Etudiant recherche(String name)
    {
        for(Etudiant etudiant : this.etudiants)
        {
            if(etudiant.getName().equalsIgnoreCase(name))
            {
                return etudiant;
            }
        }
        return null;
    }

    public ArrayList<Etudiant> admis()
    {
        ArrayList<Etudiant> admis = new ArrayList<>();
        for(Etudiant e : this.etudiants)
        {
            if(e.calculMoyenne() >=10)
            {
                admis.add(e);
            }
        }
        return admis;
    }

    public ArrayList<Etudiant> etuEtrangerNonFranco()
    {
        ArrayList<Etudiant> etrangers = new ArrayList<>();
        for(Etudiant e : this.etudiants)
        {
            if(e.getCodePays() == CodePays.Etranger)
            {
                etrangers.add(e);
            }
        }
        return etrangers;
    }

    public ArrayList<Etudiant> majors()
    {
        double moyenneMax = this.etudiants.get(0).calculMoyenne();
        ArrayList<Etudiant> majors = new ArrayList<>();
        for(Etudiant e : this.etudiants)
        {
            if(e.calculMoyenne() > moyenneMax)
            {
                moyenneMax = e.calculMoyenne();
                majors.clear();
                majors.add(e);
            }
            else if(e.calculMoyenne() == moyenneMax)
            {
                majors.add(e);
            }
        }
        return majors;
    }


    /*----------------------- Functions ------------------------*/
}
