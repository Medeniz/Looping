package be.intecbrussel.Exam12_10;

import java.util.Scanner;

public class IfElseBruto {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Brut Salary");
        int brutoloonn = scan.nextInt();
        int nettoloon;

        if (brutoloonn>3000){
            nettoloon=brutoloonn-(brutoloonn*38/100);
            System.out.println("Your Net Sallary is: " + nettoloon);
        }else if (brutoloonn>2000){
            nettoloon=brutoloonn-(brutoloonn*35/100);
            System.out.println("Your Net Sallary is: " + nettoloon);
        }else{
            nettoloon=brutoloonn-(brutoloonn*27/100);
            System.out.println("Your Net Sallary is: " + nettoloon);

        }scan.close();

    }
}
