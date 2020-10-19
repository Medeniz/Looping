package be.intecbrussel.oop;

import java.util.Scanner;

public class Opdracht6_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String text = keyboard.nextLine();
        System.out.println(text);

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.replace('a', 'o'));
        int counter = 0;
        char c = 'e';
        for (int i = 0; i <= text.length() - 1; i++) {
            if (c == text.charAt(i)) {
                counter++;
            }

        }
        System.out.println("Number of e:" + counter);
        System.out.println("Enter a sentence");
        String str1 = keyboard.nextLine();

        System.out.println("Enter a sentence");
        String str2 = keyboard.nextLine();

        boolean isStrEq = str1.equals(str2);
        System.out.println(isStrEq ? "str1 and str2 equal" : "str1 and str2 not equal");

        if (str1.compareTo(str2) == 1) {
            System.out.println(str2 +" "+ str1);
        } else {
            System.out.println(str1 + " "+ str2);
        }
        String str3 = "  Word  ";
        System.out.println(str3.trim());
    }


}
