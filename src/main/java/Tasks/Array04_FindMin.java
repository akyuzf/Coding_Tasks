package Tasks;

public class Array04_FindMin {

    public static void main(String[] args) {
        int[] arr = {-100, 25, 0, 1,2,3,4,5, 250, 500};

        System.out.println(findMin(arr));

    }


    public static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;

        for ( int each : arr )
            if (each < min)
                min = each;

        return min;
    }

}
