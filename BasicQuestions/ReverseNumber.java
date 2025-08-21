package BasicQuestions;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    int num;
    int reverseNum = 0;

    System.out.print("Enter a number:");
    Scanner obj = new Scanner(System.in);
    num = obj.nextInt();
    
    System.out.print("The reverse of the number " + num + " is:");
    while(num != 0) {
        int digit = num%10;
        reverseNum = reverseNum * 10 + digit;
        num = num/10;
    }
    System.out.println(reverseNum);
    obj.close();
 }
}
