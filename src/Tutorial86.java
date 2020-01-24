import javax.swing.*;

public class Tutorial86 {
    public static void main (String[] args) {
        JFrame f = new JFrame("TITLE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI86 g = new GUI86();
        f.add(g);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
