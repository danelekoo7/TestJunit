package pl.jedrus.tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
}