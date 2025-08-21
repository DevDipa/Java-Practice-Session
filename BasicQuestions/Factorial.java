package BasicQuestions;
import java.util.Scanner;

public class Factorial {
   
    public int fact(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }else {
            return num * fact(num -1);
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = obj.nextInt();

        Factorial fact = new Factorial();
        System.out.println("The factorial of " + num + " is: " + fact.fact(num));
        obj.close();
        

    }

}
