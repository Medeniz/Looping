package be.intecbrussel;

import java.util.Scanner;

public class Opdrach16_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;

//        while (true) {
//
//            System.out.println("Please enter a number between 0 and 10");
//            int number = scan.nextInt();
//            if ((number <= 10) && (number >= 0)) {
//                break;



        do {

            System.out.println("Please enter a number between 0 and 10");
             number = scan.nextInt();

        }while ((number<0)|| (number>10));
            }
}

