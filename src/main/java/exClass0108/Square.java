package exClass0108;

import lombok.Getter;

@Getter
public class Square implements Figure {

    private double lengthSideSquare;

    public Square(double lengthSideSquare) {
        this.lengthSideSquare = lengthSideSquare;
    }

    @Override
    public double perimeterOfTheFigure() {
        return lengthSideSquare * 4;
    }

    @Override
    public double fieldFigure() {
        return lengthSideSquare * lengthSideSquare;
    }
}
