package Tasks;

import java.util.Arrays;

public class Array03_FindMax {

    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6,5,4,8,10,1,0,-25,-100,200,1};


        System.out.println(findMax(arr));



    }


    public static int findMax(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int each: arr)

            if(each > max)

                max = each;

        return max;
    }


}
