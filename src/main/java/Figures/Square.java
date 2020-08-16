package Figures;

import lombok.Getter;

@Getter
public class Square extends AbstractSuperFigure {

    private double lengthSideSquare;

    private Square() {
    }

    @Override
    public double perimeterOfTheFigure() {
        return lengthSideSquare * 4;
    }

    @Override
    public double fieldFigure() {
        return lengthSideSquare * lengthSideSquare;
    }

    public static class Builder {

        private Square instance;

        public Builder() {
            instance = new Square();
        }

        public Square build() {
            if (instance.lengthSideSquare <= 0) {
                throw new IllegalStateException("Square side must be breated than 0");
            }
            return instance;
        }

        public Builder withSide(double side) {
            instance.lengthSideSquare = side;
            return this;
        }

        public Builder withColour(Colour colour) {
            instance.colour = colour;
            return this;
        }

        public Builder withCoordinates(double x, double y) {
            instance.x = x;
            instance.y = y;
            return this;
        }
    }
}
