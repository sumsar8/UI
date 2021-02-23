import javax.swing.*;

public class Guiform {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Guiform");
        frame.setContentPane(new Guiform().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JButton button1;
    private JTextField textField2;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
