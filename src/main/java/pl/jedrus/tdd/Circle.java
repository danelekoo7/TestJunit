package pl.jedrus.tdd;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Circle {

    public double circleArea(int r) throws IllegalArgumentException, ParseException {
        if (r < 0) {
            throw new IllegalArgumentException("n must be positive");
        } else if (r == 0) {
            return 0.0;
        }


        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        double result = Math.PI * r * r;
        String formatValue = df.format(result);

        double cos = (double) df.parse(formatValue);

        return cos;
    }
}
