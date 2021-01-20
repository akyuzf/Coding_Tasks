package Tasks;

import java.util.Arrays;

public class Array08_SortAscending {

    public static void main(String[] args) {

        int num[] = {34,7,51,1,2};

        int temp;

        for (int i = 0; i < num.length; i++)
        {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j])
                {
                    temp = num[i];   //
                    num[i] = num[j]; //
                    num[j] = temp;   // 7,34,51,1,2 - 1,34,51,7,2 ...
                }
            }
        }


        System.out.println(Arrays.toString(num));



    }

}

