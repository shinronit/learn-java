import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;


public class GUI85 extends JFrame {

    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public GUI85(){
        super("TITLE");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Choose a color");
        b.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed (ActionEvent event) {
                        color = JColorChooser.showDialog(null,"PICK YOUR COLOR", color);
                        if(color==null){
                            color = (Color.WHITE);
                        }
                        panel.setBackground(color);
                    }
                }
        );
        add(panel, BorderLayout.CENTER);
        add(b,BorderLayout.SOUTH);
        setSize(425,150);
        setVisible(true);
    }
}
