//keep tacking inputs until user enters 'x', and print the sum at the end
package BasicQuestions;
import java.util.Scanner;

public class Inputstillx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("You can enter multiple numbers and we shall print their sum for ya! Press 'x' when done:)");
        
        int sum = 0;
        while (true) {
            String txt = in.nextLine();
            if (txt.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int num = Integer.parseInt(txt);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'x' to finish.");
            }
        }
        System.out.println("The final sum is: " + sum);
        in.close();
    }
}
