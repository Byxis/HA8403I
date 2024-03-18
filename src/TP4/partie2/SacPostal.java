package TP4.partie2;

import java.util.ArrayList;

public abstract class SacPostal {

    private final ArrayList<ObjetPostal> objects = new ArrayList<>();

    private int codePostal;
    private double capaciteMax;
    private double nbMax;

    public SacPostal(double capaciteMax, double nbMax, int codePostal)
    {
        this.capaciteMax = capaciteMax;
        this.nbMax = nbMax;
        this.codePostal = codePostal;
    }

    public void addObject(ObjetPostal objetPostal)
    {
        System.out.println(getNbMax() == -1 || getNbObjects()+1 <= getNbMax());
        System.out.println(getNbMax());
        System.out.println(getNbObjects()+1);
        System.out.println(getNbMax());
        if(getNbMax() == -1 || getNbObjects()+1 <= getNbMax())
        {
            System.out.println(objetPostal.getPoids());
            System.out.println(this.capaciteMax);
            if(objetPostal.getPoids() <= this.capaciteMax)
            {
                objects.add(objetPostal);
            }
        }
    }

    public double getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(double capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public double getNbMax() {
        return nbMax;
    }

    public void setNbMax(double nbMax) {
        this.nbMax = nbMax;
    }

    public ArrayList<ObjetPostal> getObjects()
    {
        return objects;
    }

    public void remObject(ObjetPostal obj)
    {
        objects.remove(obj);
    }

    public double getCapacite()
    {
        double capacite = 0.005; // taille du sac par défaut
        if(this.objects.isEmpty())
            return capacite;
        else
        {
            for(ObjetPostal obj : this.objects)
            {
                capacite+=obj.getVolume();
            }
            return capacite;
        }
    }

    public int getNbObjects()
    {
        return this.objects.size();
    }

    public double getValRemboursement()
    {
        double remb = 0;
        for(ObjetPostal obj : this.objects)
        {
            remb += obj.tarifRemb();
        }
        return  remb;
    }

    public void fill(SacPostal sp)
    {
        if(getCodePostal() != sp.getCodePostal())
            return;
        if(sp.getCapacite()+this.getCapacite() <= this.getCapaciteMax() && (sp.getNbObjects()+this.getNbObjects() <= this.getNbMax() || this.getNbMax() == -1))
        {
            for(ObjetPostal obj : (ArrayList<ObjetPostal>) sp.getObjects().clone())
            {
                this.addObject(obj);
                sp.remObject(obj);
            }
        }
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String toString()
    {
        String sb = "Code: " + codePostal + "\n" +
                "Capacite: " + getCapacite() + "/" + this.getCapaciteMax() + "\n" +
                "Nb: " + getCapacite() + "/" + this.getCapaciteMax() + "\n" +
                "Colis: " + objects;
        return sb;
    }
}
