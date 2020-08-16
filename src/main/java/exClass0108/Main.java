package exClass0108;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[4];
final Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość promienia koła.");
        figures[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj długość podstawy trójkąta.");
        double baseTriangle = scanner.nextDouble();
        System.out.println("Podaj długość boku trójkąta.");
        double sideBTriangle = scanner.nextDouble();
        System.out.println("Podaj długośc 2 boku trójkąta.");
        double sideCTriangle = scanner.nextDouble();
        System.out.println("Podaj wysokość trójkąta.");
        double highTriangle = scanner.nextDouble();
        figures[1] = new RightTriangle(baseTriangle, sideBTriangle, sideCTriangle, highTriangle);


        System.out.println("Podaj długość boku kwadratu.");
        figures[2] = new Square(scanner.nextDouble());


        System.out.println("Podaj długosć krótszego boku prostokąta.");
        double shortSideRectangle = scanner.nextDouble();
        System.out.println("Podaj długosć dłuższego boku prostokąta");
        double longerSideRectangle = scanner.nextDouble();
        figures[3] = new Rectangle(shortSideRectangle, longerSideRectangle);

        for (Figure figure : figures) {
            System.out.println(figure.preparationDescription());
        }
    }
}
