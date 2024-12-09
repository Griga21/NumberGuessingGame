package org.gui;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainFrame extends JFrame {
    private Properties properties = new Properties();
    private JLabel title;
    private JButton startButton;
    private JButton aboutButton;
    private JPanel mainPanel;

    public void initFrame(String path) {
        try {
            properties.load(new FileReader(path));
            this.setTitle(properties.getProperty("title"));
            this.setSize(Integer.parseInt(properties.getProperty("width")), Integer.parseInt(properties.getProperty("height")));
            this.setIconImage(new ImageIcon("src/main/resources/charade.png").getImage());
            this.add(initMainPanel());
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private JPanel initMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 20, 5, 20);
        constraints.ipadx = 15;
        constraints.ipady = 50;

        constraints.gridx = 0;
        constraints.gridy = 0;

        title = new JLabel("Number Guessing Game", SwingConstants.CENTER);
        title.setFont(new Font("Ink Free", Font.BOLD, 25));
        mainPanel.add(title, constraints);

        startButton = new JButton("Start");
        startButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(startButton, constraints);

        aboutButton = new JButton("About game");
        constraints.gridx = 0;
        constraints.gridy = 2;
        aboutButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        mainPanel.add(aboutButton, constraints);
        return mainPanel;
    }
}
