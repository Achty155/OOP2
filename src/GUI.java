import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The GUI class represents the graphical user interface for the simulation.
 */
public class GUI {
    private JPanel panelMain;
    private JButton StartSim;
    private JTextField txtStrategy;
    private JTextField txtWinner;
    private JButton Graphs;

    public Elections elections;

    /**
     * Constructor for the GUI class.
     */
    public GUI() {
        txtWinner.setEditable(false);
        elections = new Elections();

        // ActionListener for the Start Simulation button
        StartSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int strategy = Integer.parseInt(txtStrategy.getText()); // Try parsing the strategy number
                    if (strategy < 1 || strategy > 3) { // Check if the strategy number is 1, 2, or 3
                        throw new IllegalArgumentException("Please enter a valid strategy number (1, 2, or 3).");
                    }
                    txtStrategy.setText("");
                    String winner = elections.Hlavni(strategy); // If valid, pass it to the main method
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

        // ActionListener for the Graphs button
        Graphs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Graphs window
                Graphs graphs = new Graphs(elections.volby.staty);
                graphs.graphsUI(elections.volby.staty);
            }
        });
    }

    /**
     * Main method to initialize and display the GUI.
     * @param args Command line arguments (not used).
     */
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
