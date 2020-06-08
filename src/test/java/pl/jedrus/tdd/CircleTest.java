package pl.jedrus.tdd;

import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void givenNumberToCalculateWhenCircleAreaCalculateThenReturnCorrectValue() throws ParseException {
        Circle circle = new Circle();

        assertEquals(12.57, circle.circleArea(2),0);
        assertEquals(28.28, circle.circleArea(3),0);
        assertEquals(0, circle.circleArea(0),0);
    }


    @Test(expected = IllegalArgumentException.class)
    public void whenNumberIsLowerThanZeroThenThrowException() throws ParseException {
        Circle circle = new Circle();
        circle.circleArea(-5);
    }
}