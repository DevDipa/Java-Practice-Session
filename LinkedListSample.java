import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<Integer> preferredNums = new LinkedList<Integer>();
        preferredNums.addFirst(1);
        preferredNums.add(2);
        preferredNums.add(3);
        preferredNums.add(5);
        preferredNums.addLast(7);

        System.out.println("The preferred numbers so far are:" + preferredNums);

        preferredNums.removeFirst();

        System.out.println("After removing the first element:" + preferredNums);

        System.out.println("The last element is: " + preferredNums.getLast());

        preferredNums.set(0, 21);

        System.out.println("After setting the first element to 21: " + preferredNums);
    }

    
}
