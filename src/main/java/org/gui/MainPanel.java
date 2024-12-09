package org.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.gui.Utils.*;

public class MainPanel extends JPanel {
    private JLabel title;
    private JButton startButton;
    private JButton aboutButton;


    public void initMainPanel() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 20, 5, 20);
        constraints.ipadx = 15;
        constraints.ipady = 50;

        constraints.gridx = 0;
        constraints.gridy = 0;

        title = new JLabel("Number Guessing Game", SwingConstants.CENTER);
        title.setFont(new Font("Ink Free", Font.BOLD, 25));
        this.add(title, constraints);

        startButton = new JButton("Start");
        startButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(startButton, constraints);

        aboutButton = new JButton("About game");
        constraints.gridx = 0;
        constraints.gridy = 2;
        aboutButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        this.add(aboutButton, constraints);
        addActionButton();
    }

    private void addActionButton() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(mainPanel);
                frame.add(gamePanel);
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
