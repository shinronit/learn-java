import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class GUI71 extends JFrame {

    private JList list;
    private static String[] colornames = {"black","blue","red","white","pink"};
    private static Color[] colors = {Color.BLACK, Color.BLUE,Color.RED,Color.WHITE,Color.PINK};

    public GUI71 (){
        super("title");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(5);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged (ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }
        );
    }
}