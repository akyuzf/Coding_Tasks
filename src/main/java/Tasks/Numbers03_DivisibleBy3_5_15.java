package Tasks;

import java.util.ArrayList;
import java.util.List;

/*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

ex:
OutPut:
Divisible By 15 : 15 30 45 60 75 90
Divisible By 5 : 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 : 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */
public class Numbers03_DivisibleBy3_5_15 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i=1; i <= 100; i++)
            list.add(i);

        System.out.println(list);
        System.out.println("===============");

        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        for(int each: list) {

            if(each %15==0 )
                divisibleBy15+= each+" ";

            if(each %5==0 && each % 15!=0)
                divisibleBy5 += each+" ";

            if(each%3==0 && each %15!=0)
                divisibleBy3 += each+" ";

        }

        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);


        System.out.println("=======================================");

        List<Integer> list1 = new ArrayList<Integer>();

        for(int i=0; i < 100; i++)

            list1.add(i+1);

        System.out.print("Divisible By 15: ");
        list1.forEach( p -> { if(p%15==0) System.out.print(p+" "); } ) ;

        System.out.print("\nDivisible By 5: ");
        list1.forEach( p -> { if(p%5==0 && p%15!=0) System.out.print(p+" "); } ) ;

        System.out.print("\nDivisible By 3: ");
        list1.forEach( p -> {if (p % 3 == 0 && p%15!=0) System.out.print(p+" "); } );


    }
}
