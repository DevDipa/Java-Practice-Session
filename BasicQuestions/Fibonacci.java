package BasicQuestions;
import java.util.Scanner;

public class Fibonacci {
    public int fibo(int num) {
        if(num == 0) {
            return 0;
        }else if(num == 1) {
            return 1;
        }else {
            return fibo(num-1) + fibo(num-2);
        }
    }

    public static void main(String[] args) {

        int term;

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series:");
        term = obj.nextInt();

        Fibonacci fib = new Fibonacci();
        System.out.print("The required fibonacci series is: ");

        for(int i=0; i<term; i++) {
            System.out.print(fib.fibo(i) + " ");
        }

    }

}
