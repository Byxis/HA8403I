package TP1;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Launching TP1");
        System.out.println("---");
        System.out.println("");

        Rectangle r1 = new Rectangle(100, 500);

        System.out.println("Aire : "+r1.getAire());
        r1.setLargeur(200);
        System.out.println("Aire : "+r1.getAire());

        System.out.println("");
        System.out.println("---");
        System.out.println("");

        Tortue t1 = new Tortue(12, EspeceEnum.Caroline, true, FoodEnum.fruits, GenreEnum.male);
        t1.getAge();
        System.out.println(t1.getGenre());

        System.out.println("");
        System.out.println("---");
        System.out.println("");

        System.out.println("En été à Montpellier : 35 degrés celsius valent "+
                celsius2Farenheit(35)+" en degrés Farenheit");
        System.out.println("L'eau bout à 100 degrés celsius ce qui vaut "+
                celsius2Farenheit(35)+" en degrés Farenheit");
    }

    public static double celsius2Farenheit(double tempC)
    {
        return tempC * 1.8 + 32;
    }
}