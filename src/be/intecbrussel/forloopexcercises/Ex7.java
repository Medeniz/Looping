package be.intecbrussel.forloopexcercises;

public class Ex7 {
    public static void main(String[] args) {

        for (int num=0;num<=10_000;num++){
            boolean isDividableBy6 = num % 6 ==0;
            boolean isDividableBy28 = num % 28 ==0;

            if(isDividableBy6 && isDividableBy28 ){
                System.out.println(num);

            }
        }
    }
}
