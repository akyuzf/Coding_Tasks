package Tasks;

import java.util.Scanner;

/*
Write  a method which can identifies given number is even or odd
 */
public class Numbers_OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        System.out.println("This number is " + evenOrOdd(number));
    }


    public static String evenOrOdd(int num) {

//        return num %2 == 0 ? "even" : "odd";

        if (num % 2 == 0)
            return "even";
        else
            return "odd";

    }


}
