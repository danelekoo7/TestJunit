package pl.jedrus.homework;

public class NWD {
    public int nwd(int a, int b) throws IllegalArgumentException {

        if (a <= 0 || b <= 0) throw new IllegalArgumentException("liczby muszą być większe od zera");

        int max = 0;
        int result = 0;

        if (a > b) {
            max = b;
        } else {
            max = a;
        }

        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;
    }
}
