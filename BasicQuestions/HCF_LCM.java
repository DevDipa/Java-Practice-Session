package BasicQuestions;
import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers to find their HCF and LCM:");
        int a = in.nextInt();
        int b = in.nextInt();

        int hcf = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        
        System.out.println("HCF of " + a + " and " + b + ": " + hcf);
        System.out.println("LCM of " + a + " and " + b + ": " + lcm);
       
        in.close();
    }
}
