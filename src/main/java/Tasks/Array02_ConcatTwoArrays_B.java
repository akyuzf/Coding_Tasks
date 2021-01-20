package Tasks;

import java.util.Arrays;

public class Array02_ConcatTwoArrays_B {

    public static void main(String[] args) {

        String[] arr1 = new String[]{"AA","BB","CC"};
        String[] arr2 = new String[]{"DD","EE","FF"};

        System.out.println( Arrays.toString( concatTwoArrays(arr1, arr2) ) );

    }


        public static String[] concatTwoArrays ( String[] arr1, String[] arr2){

            String[] result = new String[arr1.length + arr2.length];

            int i = 0;

            for (String each : arr1) {

                result[i] = each;

                i++;

            }

            for (String each : arr2) {

                result[i] = each;

                i++;

            }

            return result;

        }

    }

