package org.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.gui.Utils.mainPanel;
import static org.logic.ActionButton.createGamePanel;


public class MainPanel {
    public static JButton startButton = new JButton();
    private JTextField hiddenNumber = new JTextField();
    private JTextField minNumber = new JTextField();
    private JTextField maxNumber = new JTextField();
    private JLabel titleGame = new JLabel("Number Guessing", SwingConstants.CENTER);
    private JLabel hiddenNumberLabel = new JLabel("Make a number", SwingConstants.CENTER);
    private JLabel minNumberLabel = new JLabel("Minimum Value", SwingConstants.CENTER);
    private JLabel maxNumberLabel = new JLabel("Maximum Value", SwingConstants.CENTER);


    public JPanel initMainPanel() {
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(5, 20, 10, 20);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;

        Font BigFontTR = new Font("Gabriola", Font.BOLD, 30);
        titleGame.setFont(BigFontTR);
        titleGame.setAlignmentX(Component.CENTER_ALIGNMENT);

        hiddenNumberLabel.setFont(BigFontTR);
        hiddenNumberLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        minNumberLabel.setFont(BigFontTR);
        minNumberLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        maxNumberLabel.setFont(BigFontTR);
        maxNumberLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        startButton.setText("Start");
        startButton.setToolTipText("Press the Start button");
        startButton.setBackground(Color.WHITE);
        startButton.setFont(BigFontTR);
        startButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        hiddenNumber.setText("0");
        hiddenNumber.setFont(BigFontTR);
        minNumber.setText("0");
        minNumber.setFont(BigFontTR);
        maxNumber.setText("100");
        maxNumber.setFont(BigFontTR);

        mainPanel.add(titleGame, c);
        mainPanel.add(startButton, c);
        mainPanel.add(hiddenNumberLabel, c);
        mainPanel.add(hiddenNumber, c);
        mainPanel.add(minNumberLabel, c);
        mainPanel.add(minNumber, c);
        mainPanel.add(maxNumberLabel, c);
        mainPanel.add(maxNumber, c);
        return mainPanel;
    }
    public  void addActionButton(){
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createGamePanel();
            }
        });
    }
}
