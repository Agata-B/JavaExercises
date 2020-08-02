package exClass0108;

import lombok.Getter;

@Getter
public class Rectangle implements SuperFigure {

    private double longerSideRectangle;
    private double shortSideRectangle;
    private Colour colour;
    private double x;
    private double y;

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

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }

    @Override
    public void positionTheFigure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
