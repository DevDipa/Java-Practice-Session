import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> theTrio = new ArrayList<String>();

        //adding elements at specific positions
        theTrio.add(0, "Dips");
        theTrio.add(1, "Bhawsie");
        theTrio.add(2, "Jenn");
        theTrio.add(3, "Unknown");

        //displaying all the elements
        System.out.println(theTrio);

        //removing an element at a specific position
        theTrio.remove(3);

        //setting an element at a specific position
        theTrio.set(2, "Jenn10");

        //getting an element at a specific position
        System.out.println("The first element is: " + theTrio.get(0));

        //displaying the size of the ArrayList
        System.out.println("The size of the ArrayList is: " + theTrio.size());

        //to remove all the elements, use: clear() as theTrio.clear();

    }
}