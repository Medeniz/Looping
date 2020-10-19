package be.intecbrussel.package1;

import java.util.Scanner;

public class Methode1 {

    public static int add(int a, int b){
        int result = (a+b);
        return result;
    }
    public static int subs(int a, int b){
        int result = (a-b);
        return result;
    }
    public static int mult(int a, int b){
        int result = (a*b);
        return result;
    }
    public static int div(int a, int b){
        int result = (a/b);
        return result;
    }
    public static int mod(int a, int b){
        int result = (a%b);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want me to do? (+,-,*,/,%)");
        char op = scan.next().charAt(0);
        System.out.println("Please enter two numbers");
        int a= scan.nextInt();
        int b = scan.nextInt();

        if (op=='+'){
            System.out.println(add(a,b));

        }else if(op=='-'){
            System.out.println(subs(a,b));

        }else if(op=='*'){
            System.out.println(mult(a,b));
         }else if(op=='/') {
            System.out.println(div(a, b));
        }else if (op=='%'){
            System.out.println(mod(a,b));
        }

    }
}