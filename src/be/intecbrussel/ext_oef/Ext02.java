package be.intecbrussel.ext_oef;

import java.util.Scanner;

public class Ext02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        String str2= "aeiuo";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i)==str2.charAt(j)){
                    counter++;
            }
        }

            } System.out.println(counter);
        }
    }

