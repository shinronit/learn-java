import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class GUI72 extends JFrame {

    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] food = {"bacon","wings","ham","egg curry","morebecon"};

    public GUI72(){
        super("title");
        setLayout(new FlowLayout());

        leftlist = new JList(food);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("move -->");
        movebutton.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent event) {
                        rightlist.setListData(leftlist.getSelectedValues());
                    }
                }
        );
        add(movebutton);
    }
}
