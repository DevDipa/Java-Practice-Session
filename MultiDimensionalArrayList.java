import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.print("How many ArrayLists do you want in your Multidimensional ArrayList? ");
        int num = in.nextInt();


        //initialization
        for (int i = 0; i < num; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 0; i < num; i++) {
            System.out.println("Enter the elements for the ArrayList: " + i);
            for (int j = 0; j < 3; j++) {
            list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
