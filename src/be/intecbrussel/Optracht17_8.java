package be.intecbrussel;

public class Optracht17_8 {

    public static void main(String[] args) {
        int a=2;
        int count=0;
        int b=2;

        for (a=2; a<1000;a++){
            boolean isPriem=true;
            for (b=2; b<a;b++){
                if(a%b==0){
                    isPriem=false;
                }
            }
           if(isPriem) {
            System.out.println(a);
            count++;
        }
        }
        System.out.println("Aantal van Priemgetallen: " + count);
    }
}
