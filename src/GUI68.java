import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class GUI68 extends JFrame {

    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"r.png","x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};

    public GUI68(){
        super("the title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

    }
}
