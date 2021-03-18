package Tasks;

public class Numbers_MissingNumber {


    public static void main(String args[]) {

        int[] numbers = new int[]{1,2,3,4,6,7};

        int last_num = 7;
        int expected_sum = last_num * ((last_num + 1) / 2);
        System.out.println("Expected sum is " + expected_sum);

        int numbers_sum = 0;
        for (int each: numbers) {
            numbers_sum += each;
        }

        System.out.println("The missing number is " + (expected_sum - numbers_sum) );


    }

}