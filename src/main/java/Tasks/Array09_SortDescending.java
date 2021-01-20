package Tasks;

import java.util.Arrays;

public class Array09_SortDescending {

    public static void main(String[] args) {

        int num[] = {34,7,51,1,2};

        int temp;

        for (int i = 0; i < num.length; i++)
        {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j])
                {
                    temp = num[i];   //
                    num[i] = num[j]; //
                    num[j] = temp;   // 51,7,34,1,2 - 51,34,7,1,2 ...
                }
            }
        }


        System.out.println(Arrays.toString(num));


    }


}
