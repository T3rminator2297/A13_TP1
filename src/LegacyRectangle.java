//Classe triangle
public class LegacyRectangle
{
    private double largeur;
    private double hauteur;

    //Constructeur avec toute les parametres
    public LegacyRectangle(double width, double height)
    {
        this.largeur = width;
        this.hauteur = height;
    }

    //Constructeur vide
    public LegacyRectangle()
    {

    }

    //Pour trouver l'aire d'uun rectangle
    public double calculerAire()
    {
        return largeur * hauteur;
    }

    //Afficher les informations du triangle
    public void affichage()
    {
        System.out.println("\nLegacy Rectangle:");
        System.out.println("\nLargeur: " + largeur);
        System.out.println("\nHauteur: " + hauteur);
        System.out.println("\nAire: " + calculerAire());
    }
}