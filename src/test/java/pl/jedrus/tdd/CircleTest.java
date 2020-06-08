package pl.jedrus.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void given2WhenCircleAreaCalculateThenReturn12Point57() {
        int n = 2;
        double expected = 12.57;

        Circle circle = new Circle();
        double result = circle.circleArea(n);


        assertEquals(result, expected,0.01);
    }
}