import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;


public class GUI84 extends JPanel{

    public void paintComponent (Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25,25,100,30);

        g.setColor(new Color(190,81,215));
        g.fillRect(25,65,100,30);

        g.setColor(Color.RED);
        g.drawString("This is some text",25,120);
    }

}
