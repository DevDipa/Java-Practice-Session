import javax.swing.*;
import java.awt.event.*;

public class Qn1Internals extends JFrame implements ActionListener{
    //declare the Swing components
    JTextField t1, t2, t3;
    JButton b;

    public Qn1Internals() {
        //frame settings
        setTitle("Java Internals Q.N.1");
        setLayout(null);
        setSize(500,500);

        //input textfield settings
        t1 = new JTextField();
        t1.setBounds(200, 200, 100, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(200, 250, 100, 30);
        add(t2);

        //button settings
        b = new JButton("OK");
        b.setBounds(250, 290, 50, 30);
        add(b);
        //register the ActionListener
        b.addActionListener(this);

        //output textfield settings
        t3 = new JTextField();
        t3.setBounds(200, 320, 100, 30);
        add(t3);

        setVisible(true);
    }

    //method for addition on clicking the OK button
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        int c = a + b;

        t3.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        new Qn1Internals();
    }
}
