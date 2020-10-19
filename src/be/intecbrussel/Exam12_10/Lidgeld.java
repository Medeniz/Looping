package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class Lidgeld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your number of children");
        int child = scan.nextInt();
        System.out.println("Enter your Salary");
        int salary = scan.nextInt();

        double lastPrice;
        double dis1;
        if (child > 5){
            dis1 = 5;
        } else {
            dis1 = child;
        }

        double dis2 = 0;
        if (age > 50) {
            dis2 = 2;

        }
        double dist = dis1 + dis2;
        if (dist > 8.5) {
            dist = 8.5;
        }
        if (salary < 12500 && dist < 7.5) {
            lastPrice = 2.5;
        } else {
            lastPrice = 10 - dist;

        } System.out.println("The amount you will pay is: " + lastPrice + "€");


    }
}

