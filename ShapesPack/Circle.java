package ShapesPack;
import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        radius = in.nextInt();
        System.out.println("Area of circle: " + Math.PI * radius * radius);
        //in.close();
    }

}
