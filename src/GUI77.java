import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class GUI77 extends JFrame {
    private String details;
    private JLabel statusbar;

    public GUI77(){
        super("TITLE");
        statusbar = new JLabel("This is default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }

    private class Mouseclass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You Clicked %d", event.getClickCount());

            if(event.isMetaDown()){
                details += "with right mouse button";
            }else if(event.isAltDown()){
                details += "with center mouse button";
            }else{
                details += "with left mouse button";
            }
        statusbar.setText(details);
        }
    }
}
