package BasicQuestions;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the first string: ");
        str1 = obj.nextLine();
        //obj.nextLine(); //to consume the ENTER key
        System.out.println("Enter the second string: ");
        str2 = obj.nextLine();

        System.out.println("***************Before swapping***************");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swapping logic without using a third variable
        str1 = str1 + str2; //concatenate both strings and store in str1
        str2 = str1.substring(0, str1.length() - str2.length()); //extract original str1
        str1 = str1.substring(str2.length()); //extract original str2       


        System.out.println("***************After swapping***************");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        obj.close();
    }

}
