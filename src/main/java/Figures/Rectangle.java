package Figures;

import lombok.Getter;

@Getter
public final class Rectangle extends AbstractSuperFigure {

    private double longerSideRectangle;
    private double shortSideRectangle;

    private Rectangle(Builder builder) {
        this.longerSideRectangle = longerSideRectangle;
        this.shortSideRectangle = shortSideRectangle;
        this.colour = builder.colour;
        this.x = builder.x;
        this.y = builder.y;
    }

    @Override
    public double perimeterOfTheFigure() {
        return (2 * longerSideRectangle) + (2 * shortSideRectangle);
    }

    @Override
    public double fieldFigure() {
        return longerSideRectangle * shortSideRectangle;
    }

    public static class Builder {

        private double longerSideRectangle;
        private double shortSideRectangle;
        private Colour colour;
        private double x;
        private double y;

        public Rectangle build() {
            if (longerSideRectangle <= 0 || shortSideRectangle <= 0) {
                throw new IllegalStateException("Long side and short side");
            }
            return new Rectangle(this);
        }

        public Builder withLongSide(double longerSideRectangle) {
            this.longerSideRectangle = longerSideRectangle;
            return this;
        }

        public Builder withShortSide(double shortSideRectangle) {
            this.shortSideRectangle = shortSideRectangle;
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
