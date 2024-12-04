package org.gui;

import javax.swing.*;
import java.awt.*;

import static org.gui.Utils.gamePanel;
import static org.logic.ActionButton.addChangeNumber;
import static org.logic.ActionButton.addEndGame;

public class GamePanel {
    public static JButton yesButton = new JButton();
    public static JButton noButton = new JButton();
    public static JLabel hiddenNumberLabel = new JLabel("0", SwingConstants.CENTER);
    private JLabel title = new JLabel("Is this your number?", SwingConstants.CENTER);


    public JPanel initGamePanel() {
        gamePanel.setBackground(Color.WHITE);
        gamePanel.setLayout(new GridBagLayout());
        gamePanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(5, 20, 10, 20);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        Font BigFontTR = new Font("Gabriola", Font.BOLD, 30);

        title.setFont(BigFontTR);

        hiddenNumberLabel.setFont(new Font("Gabriola", Font.BOLD, 40));

        yesButton.setFont(BigFontTR);
        yesButton.setText("Yes");

        noButton.setFont(BigFontTR);
        noButton.setText("No");

        gamePanel.add(title, c);
        gamePanel.add(hiddenNumberLabel, c);
        gamePanel.add(yesButton, c);
        gamePanel.add(noButton, c);
        addEndGame();
        addChangeNumber();

        return gamePanel;
    }
}
