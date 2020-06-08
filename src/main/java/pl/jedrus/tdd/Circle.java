package pl.jedrus.tdd;

public class Circle {

    public double circleArea(int r) throws IllegalArgumentException {
        if (r < 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        return 0.0;
    }
}
