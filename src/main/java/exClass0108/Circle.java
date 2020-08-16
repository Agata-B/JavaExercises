package exClass0108;

import lombok.Getter;

@Getter
public class Circle extends AbstractSuperFigure {


    public static final Double PI = Double.valueOf(Math.PI);
    private double radius;

    public Circle() {
    }

    @Override
    public double perimeterOfTheFigure() {
        return 2 * PI * radius;
    }

    @Override
    public double fieldFigure() {
        return PI * (radius * radius);
    }

    public static class Builder {

        private final Circle prototype;

        public Builder() {
            prototype = new Circle();
        }

        Circle build(){
            if (prototype.radius <= 0) {
                throw new IllegalStateException("Circle radius must be greater than zero");
            }
            return prototype;
        }

        Builder withRadius(double radius) {
            prototype.radius = radius;
            return this;
        }

        Builder withColour(Colour colour) {
            prototype.colour = colour;
            return this;
        }

        Builder withCoordinates(double x, double y) {
            prototype.x = x;
            prototype.y = y;
            return this;
        }
    }

}
