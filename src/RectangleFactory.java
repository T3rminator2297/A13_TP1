// Implémentation concrète de la fabrique pour les rectangles
public class RectangleFactory extends FormeFactory
{
    @Override
    public Forme creerForme(double largeur, double hauteur)
    {
        LegacyRectangle legacyRectangle = new LegacyRectangle(largeur, hauteur);
        return new RectangleAdapter(legacyRectangle);
    }
}
