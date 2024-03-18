package TP2;

import java.awt.Point;

public class Rectangle {

    private double longueur;
    private double largeur;
    private Couleur couleur;
    private final Point position;
    public static final int nbCotes = 4;

    public Rectangle(double _longueur, double _largeur, Couleur _couleur)
    {
        setLongueur(_longueur);
        setLargeur(_largeur);
        this.couleur = _couleur;
        this.position = new Point(0,0);
    }
    public Rectangle(double _longueur, double _largeur, Couleur _couleur, Point _pos)
    {
        setLongueur(_longueur);
        setLargeur(_largeur);
        this.couleur = _couleur;
        this.position = _pos;
    }
    public Rectangle(double _longueur, double _largeur, Couleur _couleur, int _x, int _y)
    {
        setLongueur(_longueur);
        setLargeur(_largeur);
        this.couleur = _couleur;
        this.position = new Point(_x,_y);
    }
    public Rectangle(double _longueur, double _largeur)
    {
        setLongueur(_longueur);
        setLargeur(_largeur);
        this.couleur = Couleur.Rouge;
        this.position = new Point(0,0);
    }
    public Rectangle(double _longueur, double _largeur, Point _pos)
    {
        setLongueur(_longueur);
        setLargeur(_largeur);
        this.couleur = Couleur.Rouge;
        this.position = _pos;
    }
    public Rectangle(double _longueur, double _largeur, int _x, int _y)
    {
        setLongueur(_longueur);
        setLargeur(_largeur);
        this.couleur = Couleur.Rouge;
        this.position = new Point(_x,_y);
    }

    public String toString() {return "longueur="+this.longueur + ", largeur=" + this.largeur + ", couleur=" +
            this.couleur+", pos=["+position.x+","+position.y+"]";}

    public double Aire() {return this.longueur * this.largeur;}
    public double Perimetre() {return 2*(this.longueur + this.largeur);}

    public double getLongueur() {return longueur;}
    public double getLargeur() {
        return largeur;
    }
    public Couleur getCouleur() {return couleur;}

    public boolean setLongueur(double _longueur) {
        if(_longueur >= 0)
        {
            this.longueur = _longueur;
            return true;
        }
        return false;
    }
    public boolean setLargeur(double _largeur) {
        if(_largeur >= 0)
        {
            this.longueur = _largeur;
            return true;
        }
        return false;
    }
    public void setCouleur(Couleur _couleur) {
        this.couleur = _couleur;
    }
}
