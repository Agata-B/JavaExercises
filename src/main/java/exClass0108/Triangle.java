package exClass0108;

import lombok.Getter;

@Getter
public class Triangle implements Figure {

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

    @Override
    public double perimeterOfTheFigure() {
        return baseTriangle+sideBTriangle+sideCTriangle;
    }

    @Override
    public double fieldFigure() {

        return (baseTriangle*highTriangle)/2;
    }
}
