package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class Spelletje {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        while (number!=1){
            if (number % 2!=0){
            number=number*3+1;
                System.out.println(number);
       }    else{
            number=number/2;
                System.out.println(number);
            }


        }scan.close();
    }
}
