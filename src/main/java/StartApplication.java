import org.gui.MainFrame;

public class StartApplication {
    public static void main(String[] args) {
        MainFrame mainFrame= new MainFrame();
        mainFrame.initFrame("src/main/resources/application.properties");
    }
}
