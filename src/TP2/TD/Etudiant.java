package TP2.TD;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Etudiant {

    private int age;
    private LocalDate dateNaissance;
    private String codeIns;
    private Pays codePays;
    private double[] notes;

    public Etudiant()
    {
        this.dateNaissance = LocalDate.now();
        this.age = getAgeFromBirthDate(dateNaissance);
        this.codeIns = "";
        this.codePays = Pays.Francais;
    }
    public Etudiant(LocalDate dateNaissance, String codeIns, Pays codePays, double[] notes)
    {
        this.dateNaissance = dateNaissance;
        this.age = getAgeFromBirthDate(dateNaissance);
        this.codeIns = codeIns;
        this.codePays = codePays;
        this.notes = notes;
    }

    public Etudiant(LocalDate dateNaissance, String codeIns, Pays codePays, double note1, double note2, double note3) {
        this.dateNaissance = dateNaissance;
        this.age = getAgeFromBirthDate(dateNaissance);
        this.codeIns = codeIns;
        this.codePays = codePays;
        this.notes = new double[]{note1, note2, note3};
    }

    private int getAgeFromBirthDate(Date _birthDate)
    {
        long ageInMilliseconds = new Date().getTime() - _birthDate.getTime();
        long ageInDays = ageInMilliseconds / (1000 * 60 * 60 * 24);
        return (int) (ageInDays / 365);
    }

    private int getAgeFromBirthDate(LocalDate _birthDate)
    {
        LocalDate dob = _birthDate;
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public int getAge() {
        return this.age;
    }

    public LocalDate getBirthDate()
    {
        return this.dateNaissance;
    }

    public String getCodeIns() {
        return codeIns;
    }

    public Pays getCodePays() {
        return codePays;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNote(double note1, double note2, double note3)
    {
        this.notes = new double[]{note1, note2, note3};
    }

    public void setNote(int index, double note)
    {
        if(index >= 0 && index < 3)
        {
            this.notes[index] = note;
        }
    }

    public void SetAttributes(LocalDate _dateNaissance, String _codeIns, Pays _codePays)
    {
        this.dateNaissance = _dateNaissance;
        this.age = getAgeFromBirthDate(_dateNaissance);
        this.codeIns = _codeIns;
        this.codePays = _codePays;
    }

    public double calculMoyenne()
    {
        return (notes[0]+notes[1]+notes[2])/3;
    }

    public String calculerMention() {
        double moyenne = calculMoyenne();
        if (moyenne >= 18) return "Excellent";
        else if (moyenne >= 16) return "Très bien";
        else if (moyenne >= 14) return "Bien";
        else if (moyenne >= 12) return "Encouragement";
        else if (moyenne >= 10) return "Passable";
        return "Sans mention";
    }

    public String ligneResultats() {
        double moyenne = calculMoyenne();
        String resultats = "Age: " + this.age + "\n";
        resultats += "Date de naissance: " + this.dateNaissance + "\n";
        resultats += "Code d'inscription: " + this.codeIns + "\n";
        resultats += "Code pays: " + this.codePays + "\n";
        resultats += "Notes: " + Arrays.toString(this.notes) + "\n";
        resultats += "Moyenne: " + moyenne + "\n";
        if(moyenne >= 10)
            resultats += "Mention: " + calculerMention() + "\n";
        return resultats;
    }

    public String toString()
    {
        return "Etudiant:"+this.codeIns;
    }

}
