package org.gui.panels;

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
        setBackGroundPanel(this);

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
                gameLogic.setMinIndex(0);
                gameLogic.setMaxIndex(gameLogic.getArrayList().size());
                gameLogic.setResultIndex(gameLogic.getArrayList().size() / 2);
                frame.add(mainPanel);
                repaintFrame();
            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(gamePanel);
                questionPanel.getTitle().setText("Less or bigger then " + gameLogic.getArrayList().get(gameLogic.getResultIndex()) + "?");
                frame.add(questionPanel);
                repaintFrame();
            }
        });
    }
}
