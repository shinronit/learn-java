import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class GUI73 extends JFrame {

    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] food = {"bacon","wings","ham","egg curry","morebecon"};

    public GUI73 (){
        super("title");
        setLayout(new FlowLayout());

        leftlist = new JList(food);
        leftlist.setVisibleRowCount(3);
        leftlist.setFixedCellWidth(200);
        leftlist.setFixedCellHeight(25);
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

        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(200);
        rightlist.setFixedCellHeight(25);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
}

