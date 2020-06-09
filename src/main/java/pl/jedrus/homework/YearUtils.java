package pl.jedrus.homework;

public class YearUtils {

	public boolean isYearLeap(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
	}
}
