import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;


public class GUI76 extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;

    public GUI76(){
        super("TITLE");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar,BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousepanel.addMouseListener(handler);
        statusbar.addMouseMotionListener(handler);
    }

    private class HandlerClass implements MouseListener, MouseMotionListener{
        public void mouseClicked(MouseEvent event){
            statusbar.setText(String.format("Clicked at %d,%d", event.getX() ,event.getY()));
        }
        public void mousePressed(MouseEvent event){
            statusbar.setText("you pressed down the mouse");
        }
        public void mouseReleased(MouseEvent event){
            statusbar.setText("you released the button");
        }
        public void mouseEntered(MouseEvent event){
            statusbar.setText("you entered the area");
            mousepanel.setBackground(Color.RED);
        }
        public void mouseExited(MouseEvent event){
            statusbar.setText("the mouse has left the window");
            mousepanel.setBackground(Color.WHITE);
        }
        // these are mouse motion events
        public void mouseDragged(MouseEvent event){
            statusbar.setText("you are dragging the mouse");
        }
        public void mouseMoved(MouseEvent event){
            statusbar.setText("you moved the mouse");
        }
    }
}
