package be.intecbrussel.forloopexcercises;

import java.util.ArrayList;
import java.util.List;

public class Ex8_1 {
    public static void main(String[] args) {
    int counter = 1;
        System.out.println(2);
        List<Integer> primeList = new ArrayList<>();

        for (int number = 3; number < +1000000; number += 2) {
            boolean isPrime = true;

            for (Integer dividers : primeList) {
                if (dividers > Math.sqrt(number)) {
                    break;
                }
                if (number % dividers == 0) {
                    isPrime = false;
                    break;

                }
            }if(isPrime){
                counter++;
                primeList.add(number);
                System.out.println(number);

        }
        }System.out.println(counter);
    }
}