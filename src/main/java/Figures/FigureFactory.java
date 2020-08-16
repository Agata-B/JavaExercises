package Figures;

public class FigureFactory {

    private final static double DEFAULT_Y_COORDINATE = 0.0;
    private final static double DEFAULT_X_COORDINATE = 0.0;
    private final static Colourable.Colour DEFAULT_COLOUR = Colourable.Colour.TURQUOISE;
    private final double defaultXCoordinates;
    private final double defaultYCoordinates;
    private final Colourable.Colour defaultColour;

    public static enum FigureType {
        CIRCLE, SQUARE, RECTANGLE, RIGHT_TRIANGLE;
    }

    public static SuperFigure createDefaultFigure(FigureType figureType, double size) {
        return getSuperFigure(figureType, size, DEFAULT_COLOUR, DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE);
    }

    public static SuperFigure createDefaultFigure(FigureType figureType, double sizeA, double sizeB) {
        return getSuperFigure(figureType, sizeA, sizeB, DEFAULT_COLOUR, DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE);
    }

    public FigureFactory(double defaultXCoordinates, double defaultYCoordinates, Colourable.Colour defaultColour) {
        this.defaultXCoordinates = defaultXCoordinates;
        this.defaultYCoordinates = defaultYCoordinates;
        this.defaultColour = defaultColour;
    }

    public SuperFigure createFigure(FigureType figureType, double size) {
        return getSuperFigure(figureType, size, defaultColour, defaultXCoordinates, defaultYCoordinates);
    }

    public SuperFigure createFigure(FigureType figureType, double sizeA, double sizeB) {
        return getSuperFigure(figureType, sizeA, sizeB, defaultColour, defaultXCoordinates, defaultYCoordinates);
    }

    private static SuperFigure getSuperFigure(FigureType figureType, double size, Colourable.Colour defaultColour, double defaultXCoordinate, double defaultYCoordinate) {
        switch (figureType) {
            case CIRCLE:
                return new Circle.Builder()
                        .withRadius(size)
                        .withColour(defaultColour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            default:
                throw new IllegalArgumentException("This figure requires more size arguments.");
        }
    }

    private static SuperFigure getSuperFigure(FigureType figureType, double sizeA, double sizeB, Colourable.Colour defaultColour, double defaultXCoordinate, double defaultYCoordinate) {
        switch (figureType) {
            case RIGHT_TRIANGLE:
                return new RightTriangle.Builder()
                        .withBase(sizeA)
                        .withHeight(sizeB)
                        .withColour(defaultColour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            case RECTANGLE:
                return new Rectangle.Builder()
                        .withLongSide(sizeA)
                        .withShortSide(sizeB)
                        .withColour(defaultColour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            default:
                throw new IllegalArgumentException("This figure requires only one size argument");
        }

    }
}
