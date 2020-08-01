package exClass0108;

import lombok.Getter;

@Getter
public class Circle implements Figure {

    public static final Double PI = Double.valueOf(Math.PI);
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterOfTheFigure() {
        return 2*PI*radius;
    }

    @Override
    public double fieldFigure() {
       return PI*(radius*radius);
    }
}
