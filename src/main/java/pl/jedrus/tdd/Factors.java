package pl.jedrus.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factors {

    public static List<Integer> generatePrimeFactors(Integer n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

}
