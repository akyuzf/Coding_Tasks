package Tasks;

public class Numbers_DivideWithoutDivisionOperator {

    public static void main(String[] args) {


        int num1 = 100;
        int num2 = 11;

            if(num2==0) {

                System.out.println("Invalid Number");

                return;

            }

            System.out.print(num1 +" divided by "+num2 +" is ");

            int count =0;

            while(num1 >= num2) {

                num1 -= num2;

                count++;

            }

            System.out.println(count+", and remainder is "+num1);

        }

    }
