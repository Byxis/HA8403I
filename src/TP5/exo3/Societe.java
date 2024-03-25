package TP5.exo3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Societe {

    private final ArrayList<Stockage> m_list = new ArrayList<>();

    private boolean contracter(Personne p1, Personne p2, Contrat c)
    {
        Contrat c1 = getCurrentContract(p1);
        Contrat c2 = getCurrentContract(p2);
        if(c instanceof Mariage)
        {

            if(c1 != null && c1 instanceof PACS)
            {
                c1.finirContrat();
            }
            if(c1 != null && c1 instanceof Mariage)
            {
                return false;
            }
            if(c2 != null && c2 instanceof PACS)
            {
                c2.finirContrat();
            }
            if(c2 != null && c2 instanceof Mariage)
            {
                return false;
            }
        }
        else if(c instanceof PACS)
        {
            if(c1 != null || c2 != null)
            {
                return false;
            }
        }
        m_list.add(new Stockage(p1, p2, c));
        return true;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Stockage s : m_list)
        {
            sb.append(s.getP1()).append("   |   ").append(s.getP2()).append("   |   ").append(s.getContract());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Contrat getCurrentContract(Personne p)
    {
        for(Stockage s : m_list)
        {
            if(!s.getContract().isfinished())
            {
                if(s.getP1() == p || s.getP2() == p)
                {
                    return s.getContract();
                }
            }

        }
        return null;
    }

    public static void main(String[] args)
    {
        Societe s = new Societe();
        Personne jean = new Personne("Eude","Jean");
        Personne pierre = new Personne("Pierre","Pierre");
        Personne marie = new Personne("Joseph","Marie");
        System.out.println(s.contracter(pierre, marie, new PACS(LocalDate.now(), "Dubois")));
        System.out.println(s.contracter(jean, marie, new Mariage(LocalDate.now(), "St Clement", "Jean le Trompeur")));
        System.out.println(s);
    }
}
