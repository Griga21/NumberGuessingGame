package org.logic;

import org.gui.GamePanel;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.gui.GamePanel.yesButton;
import static org.gui.MainPanel.*;
import static org.gui.Utils.*;

public class ActionButton {

    public static void changeNumber() {

    }

    public static JPanel endGame() {
        return mainPanel;
    }

    public static void addStartGame() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                algorithm.setHiddenValue(Double.parseDouble(hiddenNumber.getText()));
                algorithm.setMinValue(Integer.parseInt(minNumber.getText()));
                algorithm.setMaxValue(Integer.parseInt(maxNumber.getText()));
                frame.getContentPane().remove(mainPanel);
                frame.add(new GamePanel().initGamePanel());
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        });
    }

    public static void addEndGame() {
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.removeAll();
                gamePanel.removeAll();
                frame.getContentPane().remove(gamePanel);
                frame.add(mainPanel);
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        });
    }


    public static void addChangeNumber() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeNumber();
            }
        });
    }
}
