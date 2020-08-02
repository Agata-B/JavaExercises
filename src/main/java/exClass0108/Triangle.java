package exClass0108;

import lombok.Getter;

@Getter
public class Triangle implements SuperFigure{

    private double baseTriangle;
    private double sideBTriangle;
    private double sideCTriangle;
    private double highTriangle;
    private Colour colour;
    private double x;
    private double y;

    public Triangle(double baseTriangle, double sideBTriangle, double sideCTriangle, double highTriangle) {
        this.baseTriangle = baseTriangle;
        this.sideBTriangle = sideBTriangle;
        this.sideCTriangle = sideCTriangle;
        this.highTriangle = highTriangle;
    }

    @Override
    public double perimeterOfTheFigure() {
        return baseTriangle+sideBTriangle+sideCTriangle;
    }

    @Override
    public double fieldFigure() {

        return (baseTriangle*highTriangle)/2;
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
