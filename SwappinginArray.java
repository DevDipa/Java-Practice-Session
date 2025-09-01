public class SwappinginArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};

        System.out.println("Before swapping 5 and 2:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        

        SwapIt.swap(arr, 1, 4);

        System.out.println("\nAfter swapping 5 and 2:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

class SwapIt {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
