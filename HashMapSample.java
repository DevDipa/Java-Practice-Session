import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, Integer> dob = new HashMap<String, Integer>();

        dob.put("Dipaak", 2060);
        dob.put("Dada", 2053);

        System.out.println("The HashMap looks like: " + dob);

        //iteration
        //keys only
        System.out.println("The keys in the HashMap are: ");
        for (String key : dob.keySet()) {
            System.out.println(key);
        }

        //values only
        System.out.println("The values in the HashMap are: ");
        for (int value : dob.values()) {
            System.out.println(value);
        }

        //keky-value pairs
        System.out.println("The key-value pairs in the HashMap are: ");
        for (String key : dob.keySet()) {
            System.out.println("Key: " + key + " Value: " + dob.get(key));
        }
    }
    
}
