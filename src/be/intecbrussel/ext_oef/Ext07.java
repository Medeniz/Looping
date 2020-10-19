package be.intecbrussel.ext_oef;

import java.util.Scanner;

public class Ext07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str1=scan.next();

        System.out.println(str1.indexOf(" "));
    }
}
