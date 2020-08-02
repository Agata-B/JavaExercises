package exClass0108;

import lombok.Getter;

@Getter
public class Circle implements SuperFigure {


    public static final Double PI = Double.valueOf(Math.PI);
    private double radius;
    private Colour colour;
    private double x;
    private double y;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterOfTheFigure() {
        return 2 * PI * radius;
    }

    @Override
    public double fieldFigure() {
        return PI * (radius * radius);
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
