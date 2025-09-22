package BasicQuestions;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        //if a year (except for the end of centuries) is exactly divisible by 4, it is a leap year
        //for end of centuries, it must be exactly divisible by 400
        boolean isLeap = false;

        if (year % 100 == 0) {
            //end of century
            if (year % 400 == 0) {
                isLeap = true;
            }
        } else {
            //normal years
            if (year % 4 == 0) {
                isLeap = true;
            }
        }
        if (isLeap) {
            System.out.println(year + " is a Leap Year:)");
        } else {
            System.out.println(year + " isn't a Leap year:()");
        }
        in.close();
    }
}
