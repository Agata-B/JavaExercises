package Figures;

public interface Figure {

    double perimeterOfTheFigure();
    double fieldFigure();

    default String preparationDescription(){
        return this.getType() +
                " pole: " + this.fieldFigure() +
                " obwód: " + this.perimeterOfTheFigure();
    }

   default String getType() {
        return this.getClass().getSimpleName();
   }
}
// todo przetestowac - dodc mockito do dependency i ogarnac testy