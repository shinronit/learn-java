import javax.swing.JOptionPane;

public class Custom21 {
    public static void main (String []args){

        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 - num2;

        JOptionPane.showMessageDialog(null,"The answer is " + sum, "Sum adder", JOptionPane.PLAIN_MESSAGE);

    }
}