package TP5.exo2;

public class Exemplaire {

    private boolean isEmprunte;
    private boolean isInReparation;
    private Etat etat;

    public Exemplaire(Etat etat)
    {
        this.isEmprunte = false;
        this.isInReparation = false;
        this.etat = etat;
    }

    public Exemplaire()
    {
        this.isEmprunte = false;
        this.isInReparation = false;
        this.etat = Etat.Neuf;
    }

    public void setEmprunte(boolean isEmprunte)
    {
        this.isEmprunte = isEmprunte;
    }

    public void setReparation(boolean isReparation)
    {
        this.isInReparation = isReparation;
    }

    public boolean isAvailable()
    {
        return isEmprunte && isInReparation;
    }

}
