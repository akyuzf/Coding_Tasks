package Tasks;
/*
Write a return method that returns the factorial number of any given number
 */
public class Numbers_FactorialNumber {

    public static void main(String[] args) {

        int num = 8;
        System.out.println("Factorial for "+ num + " is "+ factorialNumber(num));
    }

        public static int factorialNumber ( double num){

            int result = 1;

            for (int i = 1; i <= num; i++) {

                result = result * i;

            }

            return result;
        }


}

