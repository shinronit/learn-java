import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;


public class GUI86 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.drawLine(10,25,200,45);

        g.setColor(Color.RED);
        g.drawRect(10,55,100,35);

        g.setColor(Color.GREEN);
        g.fillOval(10,95,100,30);

        g.setColor(Color.ORANGE);
        g.fill3DRect(10,160,100,50,true);
    }
}
