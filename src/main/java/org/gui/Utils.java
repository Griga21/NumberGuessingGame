package org.gui;

import org.logic.GameLogic;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static MainPanel mainPanel;
    public static GamePanel gamePanel;
    public static MainFrame frame;
    public static QuestionPanel questionPanel;
    public static GameLogic gameLogic;
    public static GridBagConstraints constraints = new GridBagConstraints();

    public static GridBagConstraints initGriBag(GridBagConstraints constraints){
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 20, 5, 20);
        constraints.ipadx = 15;
        constraints.ipady = 50;
        constraints.gridx = 0;
        constraints.gridy = 0;
        return constraints;
    }

    public static void setBackGroundPanel(JPanel panel){
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.WHITE);
    }

    public static void repaintFrame(){
        frame.revalidate();
        frame.repaint();
    }
}
