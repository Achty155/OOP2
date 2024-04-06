import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panelMain;
    private JButton StartSim;
    private JTextField txtStrategy;


    public GUI() {
        StartSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Elections.main(null);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panelMain);
        frame.setTitle("GUI");
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
