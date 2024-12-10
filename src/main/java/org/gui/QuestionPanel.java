package org.gui;

import org.logic.GameLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.gui.Utils.*;
import static org.gui.Utils.frame;

public class QuestionPanel extends JPanel {
    private JLabel title;
    private JButton biggerButton;
    private JButton lessButton;

    public JLabel getTitle() {
        return title;
    }

    public void initQuestionPanel() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 20, 5, 20);
        constraints.ipadx = 15;
        constraints.ipady = 50;

        constraints.gridx = 0;
        constraints.gridy = 0;

        title = new JLabel("Less or bigger then " + gameLogic.getArrayList().get(gameLogic.getResultIndex()) + "?", SwingConstants.CENTER);
        title.setFont(new Font("Ink Free", Font.BOLD, 25));
        this.add(title, constraints);

        biggerButton = new JButton("Bigger");
        biggerButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(biggerButton, constraints);

        lessButton = new JButton("Less");
        constraints.gridx = 0;
        constraints.gridy = 2;
        lessButton.setFont(new Font("Ink Free", Font.BOLD, 25));
        this.add(lessButton, constraints);
        addActionButtons();
    }

    private void addActionButtons(){
        biggerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.guessNumber(false);
                gamePanel.getTitle().setText("Is this your number " + gameLogic.getArrayList().get(gameLogic.getResultIndex()) + "?");
                frame.getContentPane().remove(questionPanel);
                frame.add(gamePanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        lessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.guessNumber(true);
                gamePanel.getTitle().setText("Is this your number " + gameLogic.getArrayList().get(gameLogic.getResultIndex()) + "?");
                frame.getContentPane().remove(questionPanel);
                frame.add(gamePanel);
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
