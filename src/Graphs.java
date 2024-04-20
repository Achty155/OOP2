import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  org.jfree.chart.*;

public class Graphs {
    private JPanel panel1;
    private JComboBox<String> comboBox1;
    private JTextField textField1;

    public Graphs(State[] staty) {

        panel1 = new JPanel();
        comboBox1 = new JComboBox<>();
        textField1 = new JTextField(20);

        for (int i = 0; i < 50; i++) {
            comboBox1.addItem(staty[i].getName());
        }

        panel1.add(comboBox1);
        panel1.add(textField1);
    }






        public void graphsUI(State[] staty){
        JFrame frame = new JFrame("Graphs");
        frame.setContentPane(panel1); // Set the content pane to the already initialized panel
        frame.setTitle("Graphs");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);






        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                String selectedState = (String) comboBox.getSelectedItem();
                textField1.setText(selectedState);
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JComboBox<String> getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox<String> comboBox1) {
        this.comboBox1 = comboBox1;
    }
}