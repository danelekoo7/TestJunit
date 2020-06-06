package pl.jedrus.tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactorsTest {

    @Test
    public void givenTwoWhenGeneratePrimeFactorsThenReturnTwo() {
        Integer number = 2;
        List<Integer> expected = List.of(2);

        List<Integer> result = Factors.generatePrimeFactors(number);

        assertEquals(expected, result);
    }

    @Test
    public void given10WhenGeneratePrimeFactorsThenReturnTwoFive() {
        Integer number = 10;
        List<Integer> expected = List.of(2,5);

        List<Integer> result = Factors.generatePrimeFactors(number);

        assertEquals(expected, result);
    }

    @Test
    public void given100WhenGeneratePrimeFactorsThenReturnTwoFive() {
        Integer number = 100;
        List<Integer> expected = List.of(2,5);

        List<Integer> result = Factors.generatePrimeFactors(number);

        assertEquals(expected, result);
    }

    @Test
    public void given228WhenGeneratePrimeFactorsThenReturnTwoThreeNineteen() {
        Integer number = 228;
        List<Integer> expected = List.of(2,3,19);

        List<Integer> result = Factors.generatePrimeFactors(number);

        assertEquals(expected, result);
    }

    @Test
    public void given228WhenGeneratePrimeFactorsThenReturnTwoThreeNineteenUnordered() {
        Integer number = 228;
        List<Integer> expected = List.of(2,19,3);

        List<Integer> result = Factors.generatePrimeFactors(number);

        assertNotEquals(expected, result);
    }
}