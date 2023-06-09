import javax.swing.*;
import java.net.URL;

public class GifLoader {
    private JFrame frame;
    private JLabel label;
    private Icon icon;
    private URL url;

    public GifLoader() {
        initGUI();
        addWindowProperties();
    }

    private void initGUI() {
        frame = new JFrame("Loader"); // windows title is Loader, change
                                      // it if you don't like it!

        try {
            url = new URL("http://i.giphy.com/xT0GqdXpoKAazgF8t2.gif");
        } catch (Exception e) { }    // do nothing or just print a message

        icon = new ImageIcon(url);
        label = new JLabel(icon);
    }

    private void addWindowProperties() {
        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void loadApplication() {
        frame.setVisible(true);
    }
}