import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class T52 extends JFrame{

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public T52(){
        super("The title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter text Here");
        add(item2);

        item3 = new JTextField("Uneditable",20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);
    }

}
