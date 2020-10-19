package be.intecbrussel.ext_oef;

import java.util.Scanner;

public class Ext03 {

    public static int sum(int a, int b) {
        int result = a + b;
        return result;

    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

            System.out.println("Enter two numbers");
            int number1 = num.nextInt();
            int number2 = num.nextInt();

            System.out.println(sum(number1, number2));
            System.out.println("Dou you want countunue?(Yes:1/No:2)");
            int s = num.nextInt();
            while (s == 1) {
                System.out.println("Enter two numbers");
                number1 = num.nextInt();
                number2 = num.nextInt();

                System.out.println(sum(number1, number2));
                System.out.println("Dou you want countunue?(Yes:1/No:2)");
                s = num.nextInt();
            }

        }}



