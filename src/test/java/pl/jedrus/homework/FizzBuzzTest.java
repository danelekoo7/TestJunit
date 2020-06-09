package pl.jedrus.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void given1WhenFizzBuzzThenReturn1() {
        String expected = "1";
        assertEquals(expected,FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void given2WhenFizzBuzzThenReturn12() {
        String expected = "12";
        assertEquals(expected,FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void given3WhenFizzBuzzThenReturn12Fizz() {
        String expected = "12Fizz";
        assertEquals(expected,FizzBuzz.fizzBuzz(3));
    }


    @Test
    public void given5WhenFizzBuzzThenReturn12Fizz4Buzz() {
        String expected = "12Fizz4Buzz";
        assertEquals(expected,FizzBuzz.fizzBuzz(5));
    }


    @Test
    public void given15WhenFizzBuzzThenReturnCorrectValue() {
        String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314BuzzFizz";
        assertEquals(expected,FizzBuzz.fizzBuzz(15));
    }


}