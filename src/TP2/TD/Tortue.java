package TP2.TD;

@SuppressWarnings("ALL")
public class Tortue
{
    private int age;
    private Tortue mere;
    private Tortue pere;
    private int espereance;
    private EspeceEnum nomEspece;
    private boolean hiberne;
    private FoodEnum food;
    private HabitatEnum habitats[];
    private GenreEnum genre;

    public Tortue(int _age, EspeceEnum _nomEspece, boolean _hiberne, FoodEnum _food, GenreEnum _genre)
    {
        this.age = _age;
        this.nomEspece = _nomEspece;
        this.hiberne = _hiberne;
        this.food = _food;
        this.genre = _genre;
    }

    public String toString()
    {
        return "Tortue-"+age+"an(s)-"+nomEspece+(hiberne ? "hiberne" : "hiberne_pas")+"-"+food+"-"+genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tortue getMere() {
        return mere;
    }

    public void setMere(Tortue mere) {
        this.mere = mere;
    }

    public Tortue getPere() {
        return pere;
    }

    public void setPere(Tortue pere) {
        this.pere = pere;
    }

    public EspeceEnum getNomEspece() {
        return nomEspece;
    }

    public void setNomEspece(EspeceEnum nomEspece) {
        this.nomEspece = nomEspece;
    }

    public FoodEnum getFood() {
        return food;
    }

    public void setFood(FoodEnum food) {
        this.food = food;
    }

    public HabitatEnum[] getHabitats() {
        return habitats;
    }

    public void setHabitats(HabitatEnum[] habitats) {
        this.habitats = habitats;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public int getEspereance() {
        return espereance;
    }

    public void setEspereance(int espereance) {
        this.espereance = espereance;
    }

    public boolean isHiberne() {
        return hiberne;
    }

    public void setHiberne(boolean hiberne) {
        this.hiberne = hiberne;
    }
}

@SuppressWarnings("ALL")
enum EspeceEnum
{
    Herman,
    Caroline
}

@SuppressWarnings("ALL")
enum FoodEnum
{
    feuilles,
    fruits
}

@SuppressWarnings("ALL")
enum HabitatEnum
{
    garrigues,
    maqusi
}

@SuppressWarnings("ALL")
enum GenreEnum
{
    male,
    female
}
