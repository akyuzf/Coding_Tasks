package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

 */
public class ArrayList02_RemoveSomeValues {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list1.removeIf(p -> (p>100));

        System.out.println(list1);
        System.out.println("=====================");



        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0,0);
        list2.add(1,2);
        list2.add(2,5);
        list2.add(3,6);
        list2.add(100);
        list2.add(250);
        list2.add(500);
        System.out.println(list2);
        list2.remove(0);
        System.out.println(list2);

        System.out.println("==============");
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int each : list2) {
            if (each < 100)
                list3.add(each);

        }

        System.out.println(list3);

    }

}
