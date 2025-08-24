package BasicQuestions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = obj.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is neither prime nor composite.");
        } else if (num < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            boolean isPrime = true; 

            for (int i = 2; i <= Math.sqrt(num); i++) { //divisors always come in pairs and the smaller one is always <= sqrt(num)
                if (num % i == 0) {
                isPrime = false;
                break;
            }
}

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        obj.close();
    }
}
