package pl.jedrus;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {

        assertThat(Calculator.add(2, 3), equalTo(5.0));
        assertThat(Calculator.add(-1, 3), equalTo(2.0));
        assertThat(Calculator.add(-5, -3), equalTo(-8.0));
    }

    @Test
    public void shouldSubstractTwoNumbers() {

        assertThat(Calculator.substract(2, 3), equalTo(-1.0));
        assertThat(Calculator.substract(-1, 3), equalTo(-4.0));
        assertThat(Calculator.substract(-5, -3), equalTo(-2.0));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {

        assertThat(Calculator.multiply(2, 3), equalTo(6.0));
        assertThat(Calculator.multiply(-1, 3), equalTo(-3.0));
        assertThat(Calculator.multiply(-5, -3), equalTo(15.0));
    }

    @Test
    public void shouldDivideTwoNumbers() {

        assertThat(Calculator.divide(3, 3), equalTo(1.0));
        assertThat(Calculator.divide(0, 3), equalTo(0.0));
        assertThat(Calculator.divide(-6, -3), equalTo(2.0));
    }

    @Test(expected = ArithmeticException.class)
    public void whenDivideByZero() {
        Calculator.divide(3, 0);
    }


    @Test
    public void shouldCompareTwoNumberThenReturnTrue() {
        assertTrue(Calculator.compare(2, 2));
    }


    @Test
    public void shouldCompareTwoNumberThenReturnFalse() {
        assertFalse(Calculator.compare(2, 5));
    }



}