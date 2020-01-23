import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;


public class GUI83 extends JFrame{

    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public GUI83(){
        super("THE TITLE");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );
        rb = new JButton("Right");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );

    }
}
