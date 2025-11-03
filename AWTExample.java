import java.awt.*;

public class AWTExample extends Frame {
    public Label lbl1, lbl2;
    public TextField txt1, txt2;
    public Button btn;

    public AWTExample() {
        // frame settings
        setSize(500, 600);
        setTitle("Dipaak's Login System");
        setLayout(null);

        // adding labels
        lbl1 = new Label("Username:");
        lbl1.setBounds(100, 200, 100, 30);
        add(lbl1);
        lbl2 = new Label("Password:");
        lbl2.setBounds(100, 300, 100, 30);
        add(lbl2);

        // adding textfields
        txt1 = new TextField();
        txt1.setBounds(220, 200, 150, 30);
        add(txt1);
        txt2 = new TextField();
        txt2.setBounds(220, 300, 150, 30);
        add(txt2);

        // adding button
        btn = new Button("Login");
        btn.setBounds(200, 400, 100, 40);
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
