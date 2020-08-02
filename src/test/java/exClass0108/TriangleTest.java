package exClass0108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    public static final double BASE = 3;
    public static final double HEIGHT = 4;
    public static final double EXPECTED_AREA = BASE * HEIGHT / 2.0;
    public static final double HYPOTENUSE = 5;
    public static final double EXPECTED_PERIMETER = BASE + HEIGHT + HYPOTENUSE;
    private Triangle testTriangle;

    @BeforeEach
    void setUp() {
        testTriangle = new Triangle(BASE, HEIGHT);
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testTriangle.fieldFigure());
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testTriangle.perimeterOfTheFigure());
    }

}