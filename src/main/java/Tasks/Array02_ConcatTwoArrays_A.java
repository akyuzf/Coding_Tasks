package Tasks;

import java.util.Arrays;

public class Array02_ConcatTwoArrays_A {

    public static void main(String[] args) {

        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"D", "E", "F"};

        String[][] arr = { arr1, arr2 };
        System.out.println(Arrays.deepToString(arr));
        // print string representation of the "deep contents" of the array
        // Unlike Arrays.toString(), it can be used to convert multi-dimensional arrays to strings.


        System.out.println( Arrays.toString( concatTwoArrays(arr1, arr2) ) );
  //    System.out.println( Arrays.asList( concatTwoArrays(arr1, arr2) ) ); // printing the same

    }


    public static String[] concatTwoArrays (String[] arr1, String[] arr2){

       String[] result = new String[arr1.length + arr2.length];

       for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }


        for ( int j = 0;  j < arr2.length; j++ ) {
            result[arr1.length + j] = arr2[j];
        }
       return result;

    }


}
