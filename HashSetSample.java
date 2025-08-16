import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> blockchain = new HashSet<String>();

        blockchain.add("Hash123");
        blockchain.add("Hash456");
        blockchain.add("Hash789");
        blockchain.add("Hash123"); //Duplicate won't be stored

        System.out.println("The HashSet elements so far: " + blockchain);

        blockchain.remove("Hash789");

        System.out.println("The HashSet contains Hash789. " +blockchain.contains("Hash789"));

        System.out.println("The final number of elements is: " + blockchain.size());

        //can use clear() to remove all the elements as blockchain.clear();
    }
    
}
