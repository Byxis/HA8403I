package TP5.exo3;

import java.util.HashMap;

public class Stockage {

    private Personne p1;
    private Personne p2;
    private Contrat c;

    public Stockage(Personne p1, Personne p2, Contrat c) {
        this.p1 = p1;
        this.p2 = p2;
        this.c = c;
    }

    public Personne getP1() {
        return p1;
    }

    public Personne getP2() {
        return p2;
    }

    public Contrat getContract() {
        return c;
    }


}
