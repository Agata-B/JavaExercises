package exClass0108;

import lombok.Getter;

@Getter
public class Rectangle implements Figure {

    private double longerSideRectangle;
    private double shortSideRectangle;

    public Rectangle(double longerSideRectangle, double shortSideRectangle) {
        this.longerSideRectangle = longerSideRectangle;
        this.shortSideRectangle = shortSideRectangle;
    }

    @Override
    public double perimeterOfTheFigure() {
       return (2*longerSideRectangle)+(2*shortSideRectangle);
    }

    @Override
    public double fieldFigure() {
        return longerSideRectangle*shortSideRectangle;

    }
}
