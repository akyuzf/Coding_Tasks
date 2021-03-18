package Tasks;

    /*
Find Second largest element in an array

Input: arr[] = {13, 38, 1, 10, 34, 3}

Output: The second largest element is 34.
*/

import java.util.Arrays;

public class Numbers_SecondLargestNumber {

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {12, 35, 1, 10, 34, 1, 44};
        int n = arr.length;

        System.out.println(Arrays.toString(arr));

        print2largest(arr, n);
    }

    static void print2largest(int arr[], int arr_size)
    {
        int i;

        // There should be at least two elements
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }

        // Sort the array
        Arrays.sort(arr);

        // Start from second last element as the largest element is at last
        for (i = arr_size - 2; i >= 0; i--)
        {
            // If the element is not equal to largest element
            if (arr[i] != arr[arr_size - 1])
            {
                System.out.printf("The second largest " +
                        "element is %d\n", arr[i]);
                return;
            }
        }

        System.out.printf("There is no second " +
                "largest element\n");
    }



}
