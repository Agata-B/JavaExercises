package exClass0108;

import lombok.Getter;

@Getter
public class Triangle extends AbstractSuperFigure {

    private double hypotenuse;
    private double baseTriangle;
    private double sideBTriangle;
    private double sideCTriangle;
    private double highTriangle;


    public Triangle(double baseTriangle, double sideBTriangle, double sideCTriangle, double highTriangle) {
        this.baseTriangle = baseTriangle;
        this.sideBTriangle = sideBTriangle;
        this.sideCTriangle = sideCTriangle;
        this.highTriangle = highTriangle;
    }

    public Triangle(Builder builder) {
        this.baseTriangle = builder.base;
        this.colour = builder.colour;
        this.highTriangle = builder.height;
        this.x = builder.x;
        this.y = builder.y;
    }

    public Triangle(double base, double height) {
        this.baseTriangle = base;
        this.highTriangle = height;
        this.hypotenuse = Math.sqrt(this.baseTriangle * this.baseTriangle + this.highTriangle * this.highTriangle);
    }


    @Override
    public double perimeterOfTheFigure() {
        return baseTriangle + sideBTriangle + sideCTriangle;
    }

    @Override
    public double fieldFigure() {

        return (baseTriangle * highTriangle) / 2;
    }



    public static class Builder {

        private Colour colour;
        private double height;
        private double x;
        private double y;
        private double base;

        Triangle build() {
            return new Triangle(this);
        }


        // TODO: Proszę zaimplementować metody buildera

    }
}