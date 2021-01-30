package Tasks;
/*
Write a return method that returns the  Fibonacci of any given number
     0: 0th term

     1,1,2,3,5,8,13,21,34,55,89,

 */
public class Numbers_FibonacciNumbers {

    public static void main(String[] args) {

        System.out.println(fib(10)); // only prints n.th element

        Fibonacci(10); // print all series until n.th element

    }
    // only prints n.th element
    public static int fib(int num){

        int n1=0;
        int n2=1;
        int n3=0;

        for(int i=1; i<num; i++){

            n3=n1+n2;
            n1=n2;
            n2=n3;

        }

        return n3;

    }

    // print all series until n.th element
    public static void Fibonacci(int num) {

        int a = 1;
        int b = 1;
        System.out.print(a + " " + b);

        for(int i=2; i < num; i++) {

            int next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);

        }

    }


}
