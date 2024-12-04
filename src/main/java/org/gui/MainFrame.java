package org.gui;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.gui.Utils.frame;
import static org.gui.Utils.mainPanel;

public class MainFrame {
    public void initFrame(String path) {
        File file = new File(path);
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(file));
            frame.setSize(Integer.parseInt(properties.getProperty("width")), Integer.parseInt(properties.getProperty("height")));
            frame.setTitle(properties.getProperty("title"));
            frame.setIconImage(new ImageIcon(properties.getProperty("ico")).getImage());
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.add(mainPanel);
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла конфигурации");
        }
    }
}
