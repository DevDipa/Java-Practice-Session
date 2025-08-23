package BasicQuestions;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a word to find if it's a palindrome: ");
        String word = obj.nextLine();

        // Reverse the word
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        // Compare original and reversed
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("The provided word is a palindrome.");
        } else {
            System.out.println("The provided word isn't a palindrome.");
        }

        obj.close();
    }
}
