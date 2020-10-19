package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class Meetkunde {
    public static void main(String[] args) {
        double  vierkant;
        double  zijde = 5;
        double  driehoek;
        double  hoogte = 3;
        double  straal = 25;
        double  cirkel;

        vierkant = zijde*zijde;
        driehoek = zijde*hoogte/2;
        cirkel = straal*straal*3.14;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3");
        int number = scan.nextInt();

        if (number==1){
            System.out.println("Area of the square is: "+ vierkant);
        }else if (number==2){
            System.out.println("Area of the triangle is: "+ driehoek);
        }else if (number==3){
            System.out.println("Area of the circle is: "+ cirkel);
        }else{
            System.out.println("Please just enter 1,2 or 3");
        }scan.close();




    }
}
