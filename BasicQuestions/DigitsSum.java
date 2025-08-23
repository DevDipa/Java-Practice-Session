package BasicQuestions;
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num, sum=0;
        System.out.print("Enter a number to find the sum of its digits:");
        num = obj.nextInt();
        
        System.out.print("The sum of the digits in " + num + " is:");
        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num/=10;
        }

        System.out.print(sum);
        obj.close();
    }

}
