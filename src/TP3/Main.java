package TP3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Lettre l = new Lettre("Famille Karap, igloo 3 banquise Sud", "Famille Kirik, igloo 5 banquise Nord",
                7742, 12, 0.01, Recommendation.Un, false);

        Colis c = new Colis("Famille Karap, igloo 3 banquise Sud", "Famille Kaya, igloo 10, terre ouest",
                7854, 150, 0.02, Recommendation.Deux, "Poisson", 200);

        ColisExpress ce = new ColisExpress("Famille Karap, igloo 3 banquise Sud", "Famille Artik, igloo 90, baies des vents",
                7855, 2, 0.02, Recommendation.Deux, "Poisson", 20, LocalDate.now(), true);


        System.out.println(l);

        System.out.println(c);

        System.out.println(ce);
    }

}
