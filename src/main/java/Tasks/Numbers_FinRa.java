package Tasks;
/*
Write a method which prints out the numbers from 1 to 30
but for numbers which are a multiple of 3, print "FIN" instead of the number
and for numbers which are a multiple of 5, print "RA" instead of the number.
For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */
public class Numbers_FinRa {

    public static void main(String[] args) {


        for (int number = 1; number <= 100; number++) {
            if (number % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }



    }
}
