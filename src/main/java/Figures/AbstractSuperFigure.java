package Figures;

public abstract class AbstractSuperFigure implements SuperFigure {

    protected Colour colour;
    protected double x;
    protected double y;


    @Override
    public String preparationDescription() {
        return SuperFigure.super.preparationDescription() +
                " kolor " + this.getColour() +
                String.format("pozycja (%f, %f)",
                        this.getX(), this.getY());
    }

    @Override
    public Colour getColour() {
        return this.colour;
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
