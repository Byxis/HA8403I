package TP2.TD;

import java.util.Date;

public class Etudiant {

    private int age;
    private Date dateNaissance;
    private String codeIns;
    private Pays codePays;
    private double[] notes;

    public Etudiant()
    {
        this.dateNaissance = new Date();
        this.age = getAgeFromBirthDate(dateNaissance);
        this.codeIns = "";
        this.codePays = Pays.Francais;
    }
    public Etudiant(Date dateNaissance, String codeIns, Pays codePays, double[] notes)
    {
        this.dateNaissance = dateNaissance;
        this.age = getAgeFromBirthDate(dateNaissance);
        this.codeIns = codeIns;
        this.codePays = codePays;
        this.notes = notes;
    }

    public Etudiant(Date dateNaissance, String codeIns, Pays codePays, double note1, double note2, double note3) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
