package pl.jedrus.homework;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YearUtilsTest {

    @Test
    public void given1973WhenIsYearLeapThenReturnFalse() {
        YearUtils yearUtils = new YearUtils();
        boolean result = yearUtils.isYearLeap(1973);
        assertFalse(result);
    }

    @Test
    public void given1988WhenIsYearLeapThenReturnTrue() {
        YearUtils yearUtils = new YearUtils();
        boolean result = yearUtils.isYearLeap(1988);
        assertTrue(result);
    }

    @Test
    public void given2100WhenIsYearLeapThenReturnFalse() {
        YearUtils yearUtils = new YearUtils();
        boolean result = yearUtils.isYearLeap(2100);
        assertFalse(result);
    }

    @Test
    public void given2000WhenIsYearLeapThenReturnTrue() {
        YearUtils yearUtils = new YearUtils();
        boolean result = yearUtils.isYearLeap(2000);
        assertTrue(result);
    }
}