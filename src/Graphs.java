import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

public class Graphs {
    private JPanel panel1;
    private JComboBox<String> comboBox1;
    private JTextField textField1;
    private State[] states;

    public Graphs(State[] staty) {
        this.states = staty;
        panel1 = new JPanel(new GridBagLayout()); // Use GridBagLayout for precise component placement

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 0, 0); // Add top padding

        JLabel label = new JLabel("Pick the state");
        // Set font to bold and bigger
        label.setFont(new Font(label.getFont().getName(), Font.BOLD, 20));

        comboBox1 = new JComboBox<>();
        for (int i = 0; i < 50; i++) {
            comboBox1.addItem(staty[i].getName());
        }

        panel1.add(label, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(5, 0, 0, 0); // Add top padding

        panel1.add(comboBox1, gbc);
    }

    public void graphsUI(State[] staty) {
        JFrame frame = new JFrame("Graphs");
        frame.setContentPane(panel1); // Set the content pane to the already initialized panel
        frame.setTitle("Graphs");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                String selectedState = (String) comboBox.getSelectedItem();

                // Retrieve state data
                State selectedStateObj = null;
                for (State state : states) {
                    if (state.getName().equals(selectedState)) {
                        selectedStateObj = state;
                        break;
                    }
                }

                // Create bar chart
                if (selectedStateObj != null) {
                    JFreeChart chart = createBarChart(selectedStateObj);
                    displayChart(chart);
                }
            }
        });
    }

    private JFreeChart createBarChart(State state) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(state.getDemocraticVotes(), "Democratic", "Votes");
        dataset.addValue(state.getRepublicanVotes(), "Republican", "Votes");

        JFreeChart chart = ChartFactory.createBarChart(
                "Votes in " + state.getName(),    // Chart title
                "Party",                          // X-axis label
                "Votes",                          // Y-axis label
                dataset);                         // Dataset

        // Customizing renderer to set custom colors
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.BLUE); // Democratic votes color (index 0)
        renderer.setSeriesPaint(1, Color.RED);  // Republican votes color (index 1)

        return chart;
    }

    private void displayChart(JFreeChart chart) {
        // Create a panel to display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame chartFrame = new JFrame();
        chartFrame.setContentPane(chartPanel);
        chartFrame.setSize(600, 400);
        chartFrame.setVisible(true);
        chartFrame.setLocationRelativeTo(null);
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
