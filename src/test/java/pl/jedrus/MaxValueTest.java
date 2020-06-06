package pl.jedrus;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxValueTest {

    @Test
    public void givenListOneTwoThreeThenReturnThree() {

        int[] array = {1, 2, 3};

        int result = MaxValue.largest(array);

        assertThat(result, equalTo(3));
    }

    @Test
    public void givenListOfRandomNumberWithMaxTenThenReturnTen() {

        int[] array = {5, 10, 2, 10, 1, -157, 2, 2, 3, 8};

        int result = MaxValue.largest(array);

        assertThat(result, equalTo(10));
    }

    @Test(expected = RuntimeException.class)
    public void givenEmptyListThenThrowRuntimeException() {

        int[] array = {};

        int result = MaxValue.largest(array);
    }
}