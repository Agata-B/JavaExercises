package Figures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircleTest {

    public static final int TEST_RADIUS = 5;
    public static final double EXPECTED_PERIMETER = 2 * Math.PI * TEST_RADIUS;
    public static final double EXPECTED_AREA = Math.PI * TEST_RADIUS * TEST_RADIUS;
    private Circle testCircle;

    @BeforeEach
    void setUp() {
        testCircle = new Circle.Builder()
        .withRadius(TEST_RADIUS)
        .build();
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testCircle.fieldFigure());
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testCircle.perimeterOfTheFigure());
    }
}