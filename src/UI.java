import javax.swing.*;
public class UI {
    public static void main(String args[]) {
        JFrame frame = new JFrame("UI");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        textArea = new JTextArea(10, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);
    }
}