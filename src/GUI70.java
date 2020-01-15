import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class GUI70 extends JFrame {

    private JList list;
    private static String[] colornames = {"black","blue","red","white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE,Color.RED,Color.WHITE};

    public GUI70(){
        super("title");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));
    }

}