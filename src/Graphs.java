import javax.swing.*;

public class Graphs {
    private JPanel panel1;
    private JComboBox comboBox1;

    public Graphs(State[] staty) {
    for(int i = 0; i < 50; i++){
        comboBox1.addItem(staty[i].getName());
    }
    }
    public JPanel getPanel1() {
        return panel1;
    }
}
