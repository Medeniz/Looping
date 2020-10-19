package be.intecbrussel;


import java.util.Scanner;

class WhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int getal = scan.nextInt();


//      while (getal<100) {
//          System.out.println(getal);         WHILE LOOP
//          getal++;

        do{
            System.out.println(getal);
            getal++;                        //DO WHILE LOOP Farki: En az bir kere doner

        }while (getal <= 100);
    }
}
