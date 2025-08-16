import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<String, String> countryCaps = new TreeMap<String, String>();

        countryCaps.put("Nepal", "Kathmandu");
        countryCaps.put("Turkey", "Ankara");
        countryCaps.put("Switzerland", "Bern");

        System.out.println("The naturally sorted Key-Value pairs in the TreeMap are: " + countryCaps);
    }
    
}
