package Tasks;

import java.util.Scanner;

/*
Write a method that can check if a number is Armstrong  number
Armstrong number is a number that is equal to the sum of cubes of its digits. 
For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
 */
public class Numbers_ArmstrongNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();


        int rem, div, total = 0;

        div = number; // number=153

        // 153    ->    15      ->          1
        while (div != 0)
        {
            rem = div % 10;              // 3         // 5                // 1
            div /= 10;                   // 15        // 1                // 0
            total = total + rem*rem*rem; // 3*3*3=27  // 27+(5*5*5)=152   // 152+(1*1*1)=153
        }

        if(total == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");



    }

}
