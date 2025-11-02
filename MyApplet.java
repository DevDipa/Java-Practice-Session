import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class MyApplet extends Applet{
    
    // This method is called automatically by the browser or applet viewer
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.cyan);

        // Set the drawing color
        g.setColor(Color.red);

        // Draw a string
        g.drawString("Hello, Uni! This is Dipaak:)", 50, 50);

        // Draw a rectangle
        g.setColor(Color.blue);
        g.drawRect(40, 70, 120, 60);

        // Draw a filled oval
        g.setColor(Color.green);
        g.fillOval(200, 70, 100, 60);
    }
}