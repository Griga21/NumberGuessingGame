package org.gui;

import org.logic.GameLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.gui.Utils.*;


public class GamePanel extends JPanel {
    private JLabel title;
    private JButton yesButton;
    private JButton noButton;

    public JLabel getTitle() {
        return title;
    }

    public void initPanel() {
        this.setBackground(Color.white);
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 20, 5, 20);
        constraints.ipadx = 15;
        constraints.ipady = 50;

        constraints.gridx = 0;
        constraints.gridy = 0;
        title = new JLabel("Is this your number " + gameLogic.getArrayList().get(gameLogic.getResultIndex()) + "?", SwingConstants.CENTER);
        title.setFont(new Font("Ink Free", Font.BOLD, 25));
        this.add(title, constraints);

        yesButton = new JButton("Yes");
        yesButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(yesButton, constraints);

        noButton = new JButton("No");
        constraints.gridx = 0;
        constraints.gridy = 2;
        noButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        this.add(noButton, constraints);
        addActionButton();
    }

    private void addActionButton() {
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(gamePanel);
                frame.add(mainPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(gamePanel);
                questionPanel.getTitle().setText("Less or bigger then " + gameLogic.getArrayList().get(gameLogic.getResultIndex()) + "?");
                frame.add(questionPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
