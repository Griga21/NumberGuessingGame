package org.gui;

import javax.swing.*;
import java.awt.*;

import static org.gui.Utils.algorithm;
import static org.gui.Utils.questionPanel;
import static org.logic.ActionButton.biggerButtonAction;
import static org.logic.ActionButton.lessButtonAction;


public class QuestionPanel {
    private JLabel title = new JLabel("Your number bigger or less then " + algorithm.getResultIndex() + "?", SwingConstants.CENTER);
    public static JButton lessButton = new JButton();
    public static JButton biggerButton = new JButton();

    public JPanel initPanel() {
        questionPanel.setBackground(Color.WHITE);
        questionPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(5, 20, 10, 20);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;

        Font BigFontTR = new Font("Gabriola", Font.BOLD, 30);
        title.setFont(new Font("Gabriola", Font.BOLD, 25));

        lessButton.setFont(BigFontTR);
        lessButton.setText("Less");

        biggerButton.setFont(BigFontTR);
        biggerButton.setText("Bigger");

        questionPanel.add(title, c);
        questionPanel.add(biggerButton, c);
        questionPanel.add(lessButton, c);
        lessButtonAction();
        biggerButtonAction();
        return questionPanel;
    }
}
