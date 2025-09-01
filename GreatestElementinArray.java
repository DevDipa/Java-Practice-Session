import java.util.Scanner;

public class GreatestElementinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i =0; i < size; i++) {
            arr[i] = in.nextInt();
            
        }

        System.out.println("The array elements are:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        //finding the greatest element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nThe greatest element in the above array is: " + max);

        //finding the greatest element within a range
        int maxWithinaRange = Range.greatest(arr, 1, 3);

        System.out.println("The greatest element within the provided range is: " + maxWithinaRange);
        in.close();
    }

}

class Range {
    public static int greatest(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
