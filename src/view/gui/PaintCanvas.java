package view.gui;

import javax.swing.JComponent;
import java.awt.*;

public class PaintCanvas extends JComponent {

    public Graphics2D getGraphics2D() {

        return (Graphics2D)getGraphics();
    }
}
