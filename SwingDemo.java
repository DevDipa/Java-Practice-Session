import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingDemo extends JFrame implements ActionListener {

    JTable table;
    DefaultTableModel model;

    JTextField txtId, txtName, txtAge;
    JButton btnAdd;

    public SwingDemo() {

        //frame settings
        setTitle("Dipaak's Table Generation System");
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //database-like settings
        String[] columnNames = {"Id", "Name", "Age"};

        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        JScrollPane jsp = new JScrollPane(table);
        add(jsp, BorderLayout.CENTER);

        //custom panel settings
        JPanel jp = new JPanel();
        jp.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                "Add Your Custom Rows"
        ));

        jp.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel lblId = new JLabel("Id:");
        JLabel lblName = new JLabel("Name:");
        JLabel lblAge = new JLabel("Age:");

        txtId = new JTextField();
        txtName = new JTextField();
        txtAge = new JTextField();

        btnAdd = new JButton("ADD");

        jp.add(lblId); jp.add(txtId);
        jp.add(lblName); jp.add(txtName);
        jp.add(lblAge); jp.add(txtAge);
        jp.add(btnAdd); jp.add(new JLabel(""));

        add(jp, BorderLayout.EAST);

        //registration
        btnAdd.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {

            String id = txtId.getText();
            String name = txtName.getText();
            String age = txtAge.getText();

            //adding a new row to the table
            model.addRow(new Object[]{id, name, age});

            //to clear the textFields
            txtId.setText("");
            txtName.setText("");
            txtAge.setText("");
        }
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
