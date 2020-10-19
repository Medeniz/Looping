package be.intecbrussel.forloopexcercises;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {

        System.out.println(2);
        List<Integer> primeList = new ArrayList<>();

        for (int number = 3; number < +1000; number += 2) {
            boolean isPrime = true;

            for (Integer dividers : primeList) {
                if (dividers > Math.sqrt(number)) {
                    break;
                }
                if (number % dividers == 0) {
                    isPrime = false;
                    break;


                }
            }


        }

    }
}
