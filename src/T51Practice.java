import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T51Practice extends JFrame {

    private JLabel item1;
    public T51Practice(){
        super("TitleBar.");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a empty program");
        item1.setToolTipText("This is gonna show up on hover");
        add(item1);

    }
}
