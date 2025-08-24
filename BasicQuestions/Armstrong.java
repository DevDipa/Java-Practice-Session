package BasicQuestions;
import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstromg number: ");
        int num = obj.nextInt();
        int logicNum = num; //storing the authentic value for looping
        int checkNum = num; //storing the authentic value for final comparison

        int count = 0, testNum = 0;

        while (num != 0) {
            int digit = num % 10;
            count += 1;
            num /= 10;
        }

        while (logicNum != 0) {
            int digit = logicNum % 10;
            testNum += Math.pow(digit, count);
            logicNum /= 10;
        }

        if (checkNum == testNum ) {
            System.out.println(checkNum + " is an Armstrong number.");
        } else {
            System.out.println(checkNum + " isn't an Armstrong number");
        }
        obj.close();

    }

}
