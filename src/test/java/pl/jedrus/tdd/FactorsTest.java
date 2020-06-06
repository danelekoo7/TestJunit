package pl.jedrus.tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FactorsTest {

    @Test
    public void givenTwoWhenGeneratePrimeFactorsThenReturnOneTwo() {
        Integer number = 2;
        List<Integer> expected = List.of(1, 2);

        List<Integer> result = Factors.generatePrimeFactors(number);

        assertEquals(expected, result);

    }
}