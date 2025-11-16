import java.awt.*;
import java.awt.event.*;

public class AWT_SICalculator extends Frame implements ActionListener {

    Label lblPrincipal, lblTime, lblRate, lblResult, lblSI, lblTotal;
    TextField txtPrincipal, txtTime, txtRate, txtSI, txtTotal;
    Button btnCalc, btnReset;

    public AWT_SICalculator() {

        setSize(350, 400);
        setTitle("Dipaak's SI Calculator");

        // label settings
        lblPrincipal = new Label("Principal Amount:");
        lblPrincipal.setBounds(50, 50, 120, 30);
        add(lblPrincipal);

        lblTime = new Label("Time (years):");
        lblTime.setBounds(50, 100, 120, 30);
        add(lblTime);

        lblRate = new Label("Rate (%):");
        lblRate.setBounds(50, 150, 120, 30);
        add(lblRate);

        lblResult = new Label("------ RESULT ------");
        lblResult.setBounds(100, 260, 150, 30);
        add(lblResult);

        lblSI = new Label("Simple Interest:");
        lblSI.setBounds(50, 300, 100, 30);
        add(lblSI);

        lblTotal = new Label("Total Amount:");
        lblTotal.setBounds(50, 340, 100, 30);
        add(lblTotal);

        // textfield settings
        txtPrincipal = new TextField();
        txtPrincipal.setBounds(180, 50, 100, 30);
        add(txtPrincipal);

        txtTime = new TextField();
        txtTime.setBounds(180, 100, 100, 30);
        add(txtTime);

        txtRate = new TextField();
        txtRate.setBounds(180, 150, 100, 30);
        add(txtRate);

        txtSI = new TextField();
        txtSI.setBounds(180, 300, 100, 30);
        add(txtSI);

        txtTotal = new TextField();
        txtTotal.setBounds(180, 340, 100, 30);
        add(txtTotal);

        // button settings
        btnCalc = new Button("CALCULATE");
        btnCalc.setBounds(70, 210, 100, 40);
        add(btnCalc);

        btnReset = new Button("RESET");
        btnReset.setBounds(180, 210, 100, 40);
        add(btnReset);

        btnCalc.addActionListener(this);
        btnReset.addActionListener(this);

        // window closing settings
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalc) {
            float p = Float.parseFloat(txtPrincipal.getText());
            float t = Float.parseFloat(txtTime.getText());
            float r = Float.parseFloat(txtRate.getText());

            float si = (p * t * r) / 100;
            float total = p + si;

            txtSI.setText(String.valueOf(si));
            txtTotal.setText(String.valueOf(total));
        }

        if (e.getSource() == btnReset) {
            txtPrincipal.setText("");
            txtTime.setText("");
            txtRate.setText("");
            txtSI.setText("");
            txtTotal.setText("");
        }
    }

    public static void main(String[] args) {
        new AWT_SICalculator();
    }
}
