import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class customGui2 extends JFrame {

    private JList list;
    private static String[] colornames = {"black","blue","red","white","pink","sky blue","yellow"};
    private static Color[] colors = {Color.BLACK, Color.BLUE,Color.RED,Color.WHITE,Color.PINK,Color.CYAN,Color.YELLOW};

    public customGui2 (){
        super("title");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(4);
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