import javax.swing.JOptionPane;

public class GUI1 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter Q or q if you want to quit");

        if (input1.equals("Q") || input1.equals("q")) {
            JOptionPane.showMessageDialog(null, "You Quit");
        }
        else {
            JOptionPane.showMessageDialog(null, "INPUT INVALID !");
        }
    }
}