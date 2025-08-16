import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<Double> nums = new TreeSet<Double>();

        nums.add(21.7);
        nums.add(3.14);
        nums.add(1.07);

        System.out.println("The Set elements in NATURALLY sorted order: " + nums);
    }

    
}
