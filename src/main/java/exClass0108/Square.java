package exClass0108;

public class Square implements SuperFigure {

    private double lengthSideSquare;
    private Colour colour;
    private double x;
    private double y;

    private Square() {
    }


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
        return x;
    }

    @Override
    public double getY() {
        return y;
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
            instance.positionTheFigure(x, y);
            return this;
        }

      /*  private double lengthSideSquare;
        private Colour colour;
        private double x;
        private double y;

        public Square build() {
            return new Square(4.0);
        }

        public Builder withSide(double side) {
            this.lengthSideSquare = side;
            return this;
        }

        public Builder withColour(Colour colour) {
            this.colour = colour;
            return this;
        }

        public Builder withCoordinates(double x, double Y) {
            this.x = x;
            this.y = y;
            return this;
        }*/
    }
}
