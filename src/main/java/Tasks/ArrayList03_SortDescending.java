package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */
public class ArrayList03_SortDescending {

    public static void main(String[] args) {

        int[] list = {5,10,50,1,2,100};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.println("----------------");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(25,42,88,120,1,2,80));
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("================");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(25,42,88,120,1,2,80));

        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {

                if (list2.get(i) > list2.get(j)){
                    int temp = list2.get(i);
                    list2.set(i, list2.get(j));
                    list2.set(j, temp);

                }
            }
            
        }

        System.out.println(list2);

    }
}
