package exClass0108;

public interface Figure {

    double perimeterOfTheFigure();
    double fieldFigure();

    default String preparationDescription(){
        return this.getClass().getSimpleName() + " pole: " + this.fieldFigure() + " obwód: " + this.perimeterOfTheFigure();
    }
}
