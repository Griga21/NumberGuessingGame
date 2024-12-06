package org.logic;

import org.gui.GamePanel;
import org.gui.QuestionPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.gui.GamePanel.*;
import static org.gui.MainPanel.*;
import static org.gui.QuestionPanel.biggerButton;
import static org.gui.QuestionPanel.lessButton;
import static org.gui.Utils.*;

public class ActionButton {

    public static void changeNumber() {

    }


    public static void addStartGame() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                algorithm.setHiddenValue(Double.parseDouble(hiddenNumber.getText()));
                algorithm.setMinValue(Integer.parseInt(minNumber.getText()));
                algorithm.setMaxValue(Integer.parseInt(maxNumber.getText()));
                algorithm.initArrayList();
                hiddenNumberLabel.setText(maxNumber.getText());

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
                frame.getContentPane().remove(gamePanel);
                frame.add(mainPanel);
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        });
    }


    public static void addChangeNumber() {
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.removeAll();
                frame.getContentPane().remove(gamePanel);
                questionPanel.removeAll();
                frame.add(new QuestionPanel().initPanel());
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        });
    }

    public static void lessButtonAction() {
        lessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                algorithm.guessNumber(false);
                algorithm.setMaxValue(algorithm.getResultIndex());
                changeNumber();
                gamePanel.removeAll();
                questionPanel.removeAll();
                frame.getContentPane().remove(questionPanel);
                frame.add(new GamePanel().initGamePanel());
                frame.invalidate();
                frame.validate();
                frame.repaint();

            }
        });
    }

    public static void biggerButtonAction() {
        biggerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                algorithm.guessNumber(true);
                algorithm.setMinValue(algorithm.getResultIndex());
                questionPanel.removeAll();
                gamePanel.removeAll();
                frame.getContentPane().remove(questionPanel);
                frame.add(new GamePanel().initGamePanel());
                frame.invalidate();
                frame.validate();
                frame.repaint();
                changeNumber();
            }
        });
    }
}
