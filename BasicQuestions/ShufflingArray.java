package BasicQuestions;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ShufflingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size = in.nextInt();

        int[] arr = new int[size]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Before shuffling, your array looks like: " + Arrays.toString(arr));


        //Shuffling logic
        Random rand = new Random();

        for (int i = size - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        System.out.println("After shuffling, your array looks like: " + Arrays.toString(arr));
        in.close();
    }
}
