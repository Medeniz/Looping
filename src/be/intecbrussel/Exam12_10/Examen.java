package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your math grade");
        int math = scan.nextInt();
        System.out.println("Enter your accounting grade");
        int acc = scan.nextInt();
        System.out.println("Enter your info grade");
        int info = scan.nextInt();


        System.out.println((math>=6 && acc+info>=12) ? "You passed the class" : "You failed");

        }
    }

