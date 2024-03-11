package TP5.exo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Promotion {

    private String name;
    private final HashMap<String, Etudiant> etudiants = new HashMap<>();
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

    public Collection<Etudiant> getEtudiants()
    {
        return this.etudiants.values();
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

    public void inscrire(String num, Etudiant etudiant)
    {
        if(!this.etudiants.containsValue(etudiant))
            this.etudiants.put(num, etudiant);
    }

    public double moyenneGenerale()
    {
        double moyenne = 0;

        for(Etudiant e : this.etudiants.values())
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
        for(Etudiant e : this.etudiants.values())
        {
            e.ligneResultats();
        }
    }

    public Etudiant recherche(String name)
    {
        for(Etudiant etudiant : this.etudiants.values())
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
        for(Etudiant e : this.etudiants.values())
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
        for(Etudiant e : this.etudiants.values())
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
        for(Etudiant e : this.etudiants.values())
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
