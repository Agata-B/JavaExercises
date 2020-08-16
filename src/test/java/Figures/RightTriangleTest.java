package Figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    public static final double BASE = 3;
    public static final double HEIGHT = 4;
    public static final double EXPECTED_AREA = BASE * HEIGHT / 2.0;
    public static final double HYPOTENUSE = 5;
    public static final double EXPECTED_PERIMETER = BASE + HEIGHT + HYPOTENUSE;
    private RightTriangle testRightTriangle;

    @BeforeEach
    void setUp() {
        testRightTriangle = new RightTriangle.Builder()
        .withBase(BASE)
        .withHeight(HEIGHT)
        .build();
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testRightTriangle.fieldFigure());
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testRightTriangle.perimeterOfTheFigure());
    }

}