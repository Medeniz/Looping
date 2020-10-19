package be.intecbrussel.Exam12_10;
import java.util.Scanner;
public class EurosT {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money");
        int money = scan.nextInt();

        int one=0,two=0,five=0,ten=0,twenty=0,fifty=0,hondred=0,twehond=0,fivehond=0;

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
        System.out.println(fivehond + "  piece(s) 500 dollar");
        System.out.println(twehond + "  piece(s) 200 dollar");
        System.out.println(hondred + "  piece(s) 100 dollar");
        System.out.println(fifty + "  piece(s) 50 dollar");
        System.out.println(twenty + "  piece(s) 20 dollar");
        System.out.println(ten + "  piece(s) 10 dollar");
        System.out.println(five + "  piece(s) 5 dollar");
        System.out.println(two + "  piece(s) 2 dollar");
        System.out.println(one + "  piece(s) 1 dollar");
    }
}