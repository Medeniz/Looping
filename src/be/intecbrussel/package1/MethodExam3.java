package be.intecbrussel.package1;

import java.util.Scanner;

public class MethodExam3 {
    public static boolean isVowel(char a) {
        if (a== 'a' || a== 'i' || a== 'e'|| a=='u'|| a== 'o') {
            boolean result = true;
            return result;
        } else {
            boolean result = false;
            return result;
        }
    }

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a string");
      String str = scan.nextLine();
      int counter =0;

      for(int k =0; k<= str.length()-1;k++){
          if(isVowel(str.charAt(k))){
              counter++;
          }
      }System.out.println(counter);

    }
}