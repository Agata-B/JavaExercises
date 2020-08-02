package exClass0108;

import lombok.Getter;

@Getter
public class Rectangle extends AbstractSuperFigure {

    private double longerSideRectangle;
    private double shortSideRectangle;


    public Rectangle(double longerSideRectangle, double shortSideRectangle) {
        this.longerSideRectangle = longerSideRectangle;
        this.shortSideRectangle = shortSideRectangle;
    }

    @Override
    public double perimeterOfTheFigure() {
        return (2 * longerSideRectangle) + (2 * shortSideRectangle);
    }

    @Override
    public double fieldFigure() {
        return longerSideRectangle * shortSideRectangle;
    }

}
