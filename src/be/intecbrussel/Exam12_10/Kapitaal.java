package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class Kapitaal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of capital");
        double capital = scan.nextDouble();
        System.out.println("Enter the amount of interest");
        double interest = scan.nextDouble();
        System.out.println("Enter time");
        int time = scan.nextInt();

        for (int i=1; i<=time; i++ ){
            double quant= capital+(capital*interest/100);
            System.out.println(quant);
            capital = quant;
        }scan.close();


    }
}
