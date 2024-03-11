package TP4.partie2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Lettre l = new Lettre("Famille Karap, igloo 3 banquise Sud", "Famille Kirik, igloo 5 banquise Nord",
                7742, 0.012, 0.01, Recommendation.Un, false);

        Colis c = new Colis("Famille Karap, igloo 3 banquise Sud", "Famille Kaya, igloo 10, terre ouest",
                7854, 0.150, 0.02, Recommendation.Deux, "Poisson", 200);

        ColisExpress ce = new ColisExpress("Famille Karap, igloo 3 banquise Sud", "Famille Artik, igloo 90, baies des vents",
                7855, 0.2, 5, Recommendation.Deux, "Poisson", 20, LocalDate.now(), true);


        System.out.println(l);

        System.out.println(c);

        System.out.println(ce);

        SacOrdinaire sac = new SacOrdinaire(34980);
        SacPersonalise sac2 = new SacPersonalise(20, 34980);
        sac.addObject(l);
        sac.addObject(c);
        sac.addObject(ce);
        System.out.println(sac);
        sac2.fill(sac);

        System.out.println(sac);
        System.out.println(sac2);
    }

}
