import java.util.LinkedHashMap;

public class LinkedHashMapSample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> gender = new LinkedHashMap<String, String>();

        gender.put("Dipaak", "Female");
        gender.put("Bhawsie", "Female"); //Duplicate value is allowed
        gender.put("Jenn10", "Female");
        gender.put("Dipaak", "Female"); //Duplicate key isn't allowed; the last entered value gets updated, but the key is shown only once

        System.out.println("The LinkedHashMap looks like: " + gender);
    }
    
}