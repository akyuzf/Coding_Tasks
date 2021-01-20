package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array05_MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr1 = {1,0,2,0,3,0,4,0,5};
        System.out.println(Arrays.toString(arr1));
        moveZeros(arr1);
        System.out.println(Arrays.toString(arr1));


        System.out.println("==================");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------------");
        Integer[] arr2 = new Integer[arr1.length];
        Arrays.setAll(arr2, i -> arr1[i]);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------------");

    }


    public static int[] moveZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }



        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;


        }
    }


