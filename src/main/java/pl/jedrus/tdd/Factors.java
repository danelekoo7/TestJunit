package pl.jedrus.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factors {

    public static List<Integer> generatePrimeFactors(Integer n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;
            if (n % i == 0) {
                for (int j =2; j <= i/2; j++) {
                    if (i % j == 0) {
                        isPrimeNumber = false;
                    }
                }
                if (isPrimeNumber) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
