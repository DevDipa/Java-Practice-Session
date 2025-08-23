package BasicQuestions;
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = obj.nextInt();

        int evenSum = 0, oddSum = 0;

        while(num != 0) {
            int digit = num % 10;

            if(digit % 2 == 0) {
                evenSum += digit;
            }else {
                oddSum += digit;
            }

            num /= 10;
        }

        System.out.println("The sum of even digits is: " + evenSum);
        System.out.println("The sum of odd digits is: " + oddSum);
        obj.close();
    }

}
