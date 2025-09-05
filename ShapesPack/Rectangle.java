package ShapesPack;
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        length = in.nextInt();
        breadth = in.nextInt();
        System.out.println("Area of rectangle: " + length * breadth);
        in.close();
    }

}
