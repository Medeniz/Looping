package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class Euros2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money");
        int money = scan.nextInt();

        int one = 0;
        int two = 0;
        int five = 0;
        int ten = 0;
        int twenty = 0;
        int fifty = 0;
        int hondred = 0;
        int twehond = 0;
        int fivehond = 0;
        int i;

        while (money >= 500) {
            money -= 500;
            fivehond++;
        }
        while (money >= 200) {
            money -= 200;
            twehond++;
        }
        while (money >= 100) {
            money -= 100;
            hondred++;
        }
        while (money >= 50) {
            money -= 50;
            fifty++;
        }
        while (money >= 20) {
            money -= 20;
            twenty++;
        }
        while (money >= 10) {
            money -= 10;
            ten++;
        }
        while (money >= 5) {
            money -= 5;
            five++;
        }
        while (money >= 2) {
            money -= 2;
            two++;
        }
        while (money >= 1) {
            money -= 1;
            one++;
        }
        System.out.println(fivehond==0 ? "" : fivehond + "  piece(s) 500 dollar");
        System.out.println(twehond==0 ? "" : twehond + "  piece(s) 200 dollar");
        System.out.println(hondred==0 ? "" : hondred + "  piece(s) 100 dollar");
        System.out.println(fifty==0 ? "" : fifty + "  piece(s) 50 dollar");
        System.out.println(twenty==0 ? "" : twenty + "  piece(s) 20 dollar");
        System.out.println(ten==0 ? "" : ten + "  piece(s) 10 dollar");
        System.out.println(five==0 ? "" : five + "  piece(s) 5 dollar");
        System.out.println(two==0 ? "" : two + "  piece(s) 2 dollar");
        System.out.println(one==0 ? "" : one + "  piece(s) 1 dollar");

scan.close();
    }
}