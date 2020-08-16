package Figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[4];
        final Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.writeLine("Podaj długość promienia koła.");
        figures[0] = new Circle.Builder()
                .withRadius(scanner.nextDouble())
                .withColour(Colourable.Colour.PINK)
                .withCoordinates(2, 5)
                .build();

        logger.writeLine("Podaj dwa boki trójkąta prostokątnego.");
        figures[1] = new RightTriangle.Builder()
                .withBase(scanner.nextDouble())
                .withHeight(scanner.nextDouble())
                .withColour(Colourable.Colour.YELLOW)
                .withCoordinates(-3, -6)
                .build();

        FigureFactory greenFigureFactory = new FigureFactory(2, 4, Colourable.Colour.GREEN);

        logger.writeLine("Podja bok kwadratu.");
        figures[2] = greenFigureFactory.createFigure(
                FigureFactory.FigureType.SQUARE, scanner.nextDouble());
        figures[3] = greenFigureFactory.createFigure(
                FigureFactory.FigureType.RECTANGLE, scanner.nextDouble(), scanner.nextDouble());


        for (Figure figure : figures) {
            System.out.println(figure.preparationDescription());
        }
    }
}
