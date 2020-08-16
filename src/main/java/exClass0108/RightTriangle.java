package exClass0108;

import lombok.Getter;

@Getter
public class RightTriangle extends AbstractSuperFigure {

    private double hypotenuse;
    private double baseTriangle;
    private double highTriangle;

    private RightTriangle(Builder builder) {
        this.baseTriangle = builder.base;
        this.colour = builder.colour;
        this.highTriangle = builder.height;
        this.x = builder.x;
        this.y = builder.y;
        this.hypotenuse = Math.sqrt(this.baseTriangle * this.baseTriangle + this.highTriangle + this.highTriangle);
    }

    @Override
    public double perimeterOfTheFigure() {
        return baseTriangle + highTriangle + hypotenuse;
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

        public RightTriangle build() {
            if (height <= 0 || base <= 0) {
                throw new IllegalStateException("Base and height must be greater than 0.");
            }
            return new RightTriangle(this);
        }

        public Builder withBase(double base) {
            this.base = base;
            return this;
        }

        public Builder withHeight(double height) {
            this.height = height;
            return this;
        }

        protected Builder withColour(Colour colour) {
            this.colour = colour;
            return this;
        }

        protected Builder withCoordinates(double x, double y) {
            this.x = x;
            this.y = y;
            return this;
        }
    }
}