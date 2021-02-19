import javax.swing.*;
import java.awt.event.ActionListener;

public class UI {

    private JTextField textField1;
    private JPanel panel1;

    public static void main(String args[]) {
        JFrame frame = new JFrame("UI");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField(20);
        textField.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}