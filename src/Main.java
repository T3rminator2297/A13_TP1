import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Création de la fabrique de rectangles
        FormeFactory rectangleFactory = new RectangleFactory();

        // Saisie des dimensions pour chaque rectangle
        System.out.print("Saisissez la largeur du premier rectangle: ");
        double largeur1 = sc.nextDouble();
        System.out.print("Saisissez la hauteur du premier rectangle: ");
        double hauteur1 = sc.nextDouble();
        Forme rectangle1 = rectangleFactory.creerForme(largeur1, hauteur1);

        System.out.print("Saisissez la largeur du deuxième rectangle: ");
        double largeur2 = sc.nextDouble();
        System.out.print("Saisissez la hauteur du deuxième rectangle: ");
        double hauteur2 = sc.nextDouble();
        Forme rectangle2 = rectangleFactory.creerForme(largeur2, hauteur2);

        // Utilisation des formes (rectangles)
        afficherForme(rectangle1);
        afficherForme(rectangle2);

        sc.close();
    }

    // Méthode pour afficher les détails d'une forme
    public static void afficherForme(Forme forme) {
        double aire = forme.computeArea();
        System.out.println("Aire: " + aire);
        forme.render();
        System.out.println("---------------------------------");
    }
}