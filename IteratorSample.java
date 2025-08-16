import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<String>();
        book.add("The Psychology of Money");
        book.add("Deep Work");

        System.out.println("The ArrayList looks like: " + book);

        // iterator
        Iterator<String> it = book.iterator();
        System.out.println("The data via iteration is:");
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // reset iterator for removal
        it = book.iterator();
        while(it.hasNext()) {
            String current = it.next();
            if(current.equals("Deep Work")) {
                it.remove();  // safe removal via Iterator
            }
        }

        System.out.println("The final ArrayList looks like: " + book);  
    }
}
