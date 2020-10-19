package be.intecbrussel;

public class Opdracht17_8_2 {
    public static void main(String[] args) {


        int a = 2;
        int count = 0;
        int b = 2;


        for (a = 2; a < 1000; a++) {
            for (b = 2; b < a; b++) {
                if (a % b == 0) {
                    System.out.println(a);


                }
            }count++;

        }System.out.println(count);
    }
}
