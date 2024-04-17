import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphs {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JTextField textField1;

    public Graphs(State[] staty) {
   /* for(int i = 0; i < 50; i++){
        comboBox1.addItem(staty[i].getName());

    }*/
    }
    public void graphsUI(State[] staty){
        JFrame frame = new JFrame("Graphs");
        panel1 = new JPanel(); //TODO Panel nebyl vytvořen a nadefinován, tudiž to "c" is null byl panel
        for(int i = 0; i < 50; i++){
            comboBox1.addItem(staty[i].getName());

        } //TODO protože přidávání itemů do boxu v konstruktoru nezobrazovalo žádné itemy, tak nejspíš
        //TODO bylo potřeba to dát až sem, aby byli již vytvořené a aktulizované
        panel1.add(comboBox1);
        panel1.add(textField1);
        frame.setContentPane(panel1);
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

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

}
