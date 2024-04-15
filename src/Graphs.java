import javax.swing.*;

public class Graphs {
    private JPanel panel1;
    private JComboBox comboBox1;

    public Graphs(State[] staty) {
    for(int i = 0; i < 50; i++){
        comboBox1.addItem(staty[i].getName());

    }
   // panel1.add(comboBox1);
    }
    public void graphsUI(){
        JFrame frame = new JFrame("Graphs");
        frame.setContentPane(panel1);
        frame.setTitle("Graphs");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
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
