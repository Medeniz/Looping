package be.intecbrussel;

public class FotLoop {
    public static void main(String[] args) {
        int number = 1;

//        while (number<10);
//       System.out.println(number);                WHILE LOOP
//        number++;
//

        for (number = 1; number <= 10; number++) {        //FOR LOOP
            System.out.println(number);

        }
        for (int number1 = 2, number2 = 3; number1 <= 10; number1++, number2 *= 3) {   //IKILI FOR LOOP
            System.out.println(number1 + " " + number2);
        }

        for (number = 1; number <= 1000 ; number++) {
            if (number % 7 == 0 && number % 13 == 0 && number % 4 != 0 && number % 9 != 0) {//FOR LOOP
                System.out.println(number);
                break;

//            }
//        }for (number = 1; number <= 1000; number++) {
//            boolean isMultipleOf7 = number % 7 == 0;
//            boolean isMultipleOf13 = number % 13 == 0;
//            boolean isNoMultipleOf4 = number % 4 != 0;
//            boolean isNoMultipleOf9 = number % 9 != 0;
//
//
//      //  if(isMultipleOf7 = number % 7 == 0 && isMultipleOf13 = number % 13 == 0 && isNoMultipleOf4 = number % 4 != 0  && isNoMultipleOf9 = number % 9 != 0){
//            System.out.println(number);
//            break;

        }


        }

    }
}
