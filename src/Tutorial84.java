import javax.swing.*;

public class Tutorial84 {
    public static void main (String[] args) {
        JFrame f = new JFrame("TITLE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI84 g = new GUI84();
        f.add(g);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
