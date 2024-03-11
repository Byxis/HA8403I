package TP4.partie1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Etudiant {

    /*----------------------- Attribs --------------------------*/

    private LocalDate m_dateNaissance;
    private String m_name;
    private CodePays m_codePays;
    private double[] m_notes;

    /*----------------------- Attribs --------------------------*/



    /*--------------------- Constructors ------------------------*/

    public Etudiant()
    {
        this.m_dateNaissance = LocalDate.now();
        this.m_name = "DEFAULT";
        this.m_codePays = CodePays.Francais;
        this.m_notes = new double[]{0, 0, 0};
    }
    public Etudiant(LocalDate _dateNaissance, String _codeIns, CodePays _codePays, double[] _notes)
    {
        SetDate(_dateNaissance);
        this.m_name = _codeIns;
        this.m_codePays = _codePays;
        this.m_notes = _notes;
    }

    public Etudiant(LocalDate _dateNaissance, String _codeIns, CodePays _codePays, double _note1, double _note2, double _note3) {
        SetDate(_dateNaissance);
        this.m_name = _codeIns;
        this.m_codePays = _codePays;
        this.m_notes = new double[]{_note1, _note2, _note3};
    }

    public Etudiant(String _codeIns, int annee, CodePays _codePays, double _note1, double _note2, double _note3) {
        LocalDate date = LocalDate.of(annee, 1, 1);
        SetDate(date);
        this.m_name = _codeIns;
        this.m_codePays = _codePays;
        this.m_notes = new double[]{_note1, _note2, _note3};
    }

    /*--------------------- Constructors ------------------------*/



    /*------------------------ Getters ---------------------------*/

    private int getAgeFromBirthDate(Date _birthDate)
    {
        long ageInMilliseconds = new Date().getTime() - _birthDate.getTime();
        long ageInDays = ageInMilliseconds / (1000 * 60 * 60 * 24);
        return (int) (ageInDays / 365);
    }

    private int getAgeFromBirthDate(LocalDate _birthDate)
    {
        LocalDate today = LocalDate.now();
        return Period.between(_birthDate, today).getYears();
    }

    public int getAge() {
        return getAgeFromBirthDate(m_dateNaissance);
    }

    public LocalDate getDateNaissance()
    {
        return this.m_dateNaissance;
    }

    public String getName() {
        return m_name;
    }

    public CodePays getCodePays() {
        return m_codePays;
    }

    public double[] getNotes() {
        return m_notes;
    }

    /*------------------------ Getters ---------------------------*/



    /*------------------------ Setters ---------------------------*/

    public void setNote(double _note1, double _note2, double _note3)
    {
        double[] notes = new double[]{_note1, _note2, _note3};
        for (double note : notes) {
            if (note < 0 || note > 20) return;
        }
        this.m_notes = notes;
    }

    public void setNote(int _index, double _note)
    {
        if(_index >= 0 && _index < 3 && !(_note > 20 || _note < 0))
        {
            this.m_notes[_index] = _note;
        }
    }

    public void SetAttributes(LocalDate _dateNaissance, String _codeIns, CodePays _codePays)
    {
        SetDate(_dateNaissance);
        this.m_name = _codeIns;
        this.m_codePays = _codePays;
    }

    public void saisie()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" --- Creation de l'étudiant --- ");
        System.out.println("Année de naissance : ");
        int annee = scanner.nextInt();
        System.out.println("Mois de naissance : ");
        int mois = scanner.nextInt();
        System.out.println("Jour de naissance : ");
        int jour = scanner.nextInt();
        SetDate(LocalDate.of(annee, mois, jour));
        System.out.println("Name : ");
        this.m_name = scanner.next();
        System.out.println("L'étudiant est : Francais, Francophone, Etranger");
        this.m_codePays = CodePays.valueOf(scanner.next());
    }

    public void SetDate(LocalDate _date)
    {
        if(_date.getYear() > LocalDate.now().getYear()- 100 && _date.getYear() < LocalDate.now().getYear())
        {
            this.m_dateNaissance = _date;
        }
    }

    /*------------------------ Setters ---------------------------*/



    /*------------------------ Methods ---------------------------*/

    public double calculMoyenne()
    {
        return (m_notes[0]+ m_notes[1]+ m_notes[2])/3;
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

    public String resultats() {
        double moyenne = calculMoyenne();
        StringBuilder sb = new StringBuilder();
        sb.append("Nom: ").append(getName()).append("\n");
        sb.append("Age: ").append(getAge()).append("\n");
        sb.append("Date de naissance: ").append(getDateNaissance()).append("\n");
        sb.append("Code pays: ").append(getCodePays()).append("\n");
        sb.append("Notes: ").append(Arrays.toString(this.m_notes)).append("\n");
        sb.append("Moyenne: ").append(moyenne).append("\n");
        if(moyenne >= 10)
            sb.append("Mention: ").append(calculerMention()).append("\n");
        return sb.toString();
    }

    public static String templateResultats() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom ").append(" - ");
        sb.append("Age ").append(" - ");
        sb.append("Date de naissance ").append(" - ");
        sb.append("Code pays ").append(" - ");
        sb.append("Notes ").append(" - ");
        sb.append("Moyenne ").append(" - ");
        sb.append("Mention ");
        return sb.toString();
    }

    public String ligneResultats() {
        double moyenne = calculMoyenne();
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" - ");
        sb.append(getAge()).append(" - ");
        sb.append(getDateNaissance()).append(" - ");
        sb.append(getCodePays()).append(" - ");
        sb.append(Arrays.toString(this.m_notes)).append(" - ");
        sb.append(moyenne).append(" - ");
        if(moyenne >= 10)
            sb.append(calculerMention());
        return sb.toString();
    }

    public String toString()
    {
        return "Etudiant:"+this.m_name;
    }

    /*------------------------ Methods ---------------------------*/



}
