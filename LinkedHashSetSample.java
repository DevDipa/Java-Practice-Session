import java.util.LinkedHashSet;

public class LinkedHashSetSample {
    public static void main(String[] args) {
        LinkedHashSet<Character> chars = new LinkedHashSet<Character>();

        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println("LinkedHashSet preserves the insertion order as: " + chars);
    }
    
}
