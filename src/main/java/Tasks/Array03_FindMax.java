package Tasks;

import java.util.Arrays;

public class Array03_FindMax {

    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6,5,4,8,10,1,0,-25,-100,200,1};

        System.out.println(findMax(arr));

        System.out.println(largest(arr));

    }

    public static int findMax(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int each: arr)
            if(each > max)
                max = each;
        return max;
    }


    // Method to find maximum in arr[]
    public static int largest(int[] arr)
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

}
