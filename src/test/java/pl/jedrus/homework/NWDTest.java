package pl.jedrus.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NWDTest {

    @Test
    public void givenNumberToCalculateWhenCalculateNwdThenReturnCorrectValue() {
        NWD nwd = new NWD();
        assertEquals(30, nwd.nwd(150, 120));
        assertEquals(33, nwd.nwd(231, 198));
        assertEquals(150, nwd.nwd(150, 150));
        assertEquals(1, nwd.nwd(1, 150));
        assertEquals(30, nwd.nwd(120, 150));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenZeroOnFirstParamWhenCalculateThenThrowIllegalArgumentException(){
        NWD nwd = new NWD();
        nwd.nwd(0,5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenZeroOnSecondParamWhenCalculateThenThrowIllegalArgumentException(){
        NWD nwd = new NWD();
        nwd.nwd(2,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenBelowZeroOnFirstParamWhenCalculateThenThrowIllegalArgumentException(){
        NWD nwd = new NWD();
        nwd.nwd(-5,5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenBelowZeroOnSecondParamWhenCalculateThenThrowIllegalArgumentException(){
        NWD nwd = new NWD();
        nwd.nwd(22,-5);
    }




}