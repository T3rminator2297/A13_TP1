// Implémentation concrète de l'adapter pour les rectangles
public class RectangleAdapter implements Forme
{
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle)
    {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public double computeArea()
    {
        return legacyRectangle.calculerAire();
    }

    @Override
    public void render()
    {
        legacyRectangle.affichage();
    }
}
