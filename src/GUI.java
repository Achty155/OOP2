import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panelMain;
    private JButton StartSim;
    private JTextField txtStrategy;
    private JTextField txtWinner;
    private JButton MapOfStates;
    private JButton Graphs;



    public GUI() {
        StartSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int strategy = Integer.parseInt(txtStrategy.getText()); // Try parsing the strategy number
                    if (strategy < 1 || strategy > 3) { // Check if the strategy number is 1, 2, or 3
                        throw new IllegalArgumentException("Please enter a valid strategy number (1, 2, or 3).");
                    }
                    txtStrategy.setText("");
                    String winner = Elections.main(strategy); // If valid, pass it to the main method
                    txtWinner.setText(winner); // Display winner name
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    txtStrategy.requestFocus(); // Focus back to the input field
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
                    txtStrategy.requestFocus(); // Focus back to the input field
                }
            }
        });




        Graphs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame graphs = new JFrame("Graphs");

//                graphs.setContentPane(new Graphs(staty).getPanel1());
                graphs.setTitle("Graphs");
                graphs.setSize(600, 400);
                graphs.setVisible(true);
                graphs.setLocationRelativeTo(null);
            }
        });
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panelMain);
        frame.setTitle("GUI");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
