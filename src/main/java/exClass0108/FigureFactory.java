package exClass0108;

public class FigureFactory {
    public static enum FigureType {
        CIRCLE, SQUARE, RECTANGLE, TRIANGLE;
    }

    private static Colourable.Colour DEFAULT_COLOUR = Colourable.Colour.GREEN;

    public static Figure createFigure(FigureType figureType, double size) {
        switch (figureType) {
            case CIRCLE:
                return new Circle.Builder().withRadius(size).withColour(DEFAULT_COLOUR).build();
            //  break; nie jest wymgany bo mamy return
            case SQUARE:
                return new Square.Builder().withSide(size).withColour(DEFAULT_COLOUR).build();
            default:
                throw new IllegalArgumentException();
        }


    }
}
