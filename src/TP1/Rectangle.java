package TP1;

@SuppressWarnings("ALL")
public class Rectangle {

    private double longueur;
    private double largeur;
    private double perimetre;
    private double aire;
    private static final int nbCote = 4;
    private Color[] color;
    private static final double angle = 90;
    private Position position;
    private Rectangle[] rectanglesPlusGrands;

    public Rectangle(int _longueur, int _largeur)
    {
        this.longueur = _longueur;
        this.largeur = _largeur;
        ResetPerimAire();
    }

    public Color[] getCouleur() {
        return color;
    }

    public void setCouleur(Color[] color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Rectangle[] getRectanglesPlusGrands() {
        return rectanglesPlusGrands;
    }

    public void setRectanglesPlusGrands(Rectangle[] rectanglesPlusGrands) {
        this.rectanglesPlusGrands = rectanglesPlusGrands;
    }

    public void setLongueur(double longueur) {
        ResetPerimAire();
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
        ResetPerimAire();
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public double getAire() {
        return aire;
    }

    private void ResetPerimAire()
    {
        perimetre = longueur * 2 + largeur * 2;
        aire = longueur*largeur;
    }
}

@SuppressWarnings("ALL")
class Color
{
    private int R;
    private int G;
    private int B;
}

@SuppressWarnings("ALL")
class Position
{
    private double X;
    private double Y;

    public Position(double _X, double _Y)
    {
        this.X = _X;
        this.Y = _Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
