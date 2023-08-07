public class LegacyRectangle
{
    private double largeur;
    private double hauteur;

    public LegacyRectangle(double width, double height)
    {
        this.largeur = width;
        this.hauteur = height;
    }

    public LegacyRectangle()
    {

    }

    public double calculerAire()
    {
        return largeur * hauteur;
    }

    public void affichage()
    {
        System.out.println("\nLegacy Rectangle:");
        System.out.println("\nLargeur: " + largeur);
        System.out.println("\nHauteur: " + hauteur);
        System.out.println("\nAire: " + calculerAire());
    }
}