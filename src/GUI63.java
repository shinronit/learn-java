import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GUI63 extends JFrame {

    private JButton reg;
    private JButton custom;

    public GUI63 (){
        super("The title");
        setLayout(new FlowLayout());

        reg = new JButton("Reg button");
        add(reg);

        Icon r = new ImageIcon(getClass().getResource("r.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));
        custom = new JButton("Custom", r);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    private class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null,String.format("%s", event.getActionCommand()));
        }
    }

}
