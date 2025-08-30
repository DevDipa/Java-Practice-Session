import java.util.Scanner;

public class BasicSelectionSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array:");
        int num = obj.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = obj.nextInt();
        }
 
        System.out.println("Before sorting:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        //selection sort logic
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } 
        }

        System.out.println("\nAfter sorting in ascending order:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }

}
