public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Initially, the array looks like:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        

        //calling for reverse
        Reverse.rev(arr, 0, arr.length - 1);

        System.out.println("After reversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

class Reverse {
    public static void rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start += 1;
            end -= 1;
        }

    }
}