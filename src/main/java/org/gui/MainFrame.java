package org.gui;

import org.gui.panels.GamePanel;
import org.gui.panels.MainPanel;
import org.gui.panels.QuestionPanel;
import org.logic.GameLogic;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.gui.Utils.*;

public class MainFrame extends JFrame {
    private Properties properties = new Properties();

    public void initFrame(String path) {
        frame = this;
        try {
            properties.load(new FileReader(path));
            initAllPanels();
            this.setTitle(properties.getProperty("title"));
            this.setSize(Integer.parseInt(properties.getProperty("width")), Integer.parseInt(properties.getProperty("height")));
            this.setIconImage(new ImageIcon("src/main/resources/charade.png").getImage());
            this.add(mainPanel);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initAllPanels() {
        constraints = initGriBag(constraints);

        gameLogic = new GameLogic();
        gameLogic.initArrayList();

        mainPanel = new MainPanel();
        mainPanel.initMainPanel();

        gamePanel = new GamePanel();
        gamePanel.initPanel();

        questionPanel = new QuestionPanel();
        questionPanel.initQuestionPanel();
    }

}
