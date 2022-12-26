package UIResource;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author unggulks
 */
public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(10, 10));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
}
