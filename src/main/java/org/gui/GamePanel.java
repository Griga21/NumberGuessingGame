package org.gui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public JPanel initGamePanel(){
        this.setBackground(Color.WHITE);
        this.setLayout(new GridBagLayout());
        return this;
    }
}
