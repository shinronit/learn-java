import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;


public class GUI74 extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;

    public GUI74(){
        super("TITLE");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar,BorderLayout.SOUTH);

        //Handlerclass handler = new Handlerclass();
       // mousepanel.addMouseListener(handler);
        //statusbar.addMouseMotionListener(handler);

    }
}
