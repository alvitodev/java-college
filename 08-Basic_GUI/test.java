import javax.swing.*;
import java.awt.*;

public class ContohLayout extends JFrame {
    public ContohLayout() {
        super("Contoh Penempatan Komponen");

        // Buat label dan text field
        JLabel label = new JLabel("Nama:");
        JTextField textField = new JTextField(20);

        // Buat panel dan atur layout menjadi FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Tambahkan komponen ke panel
        panel.add(label);
        panel.add(textField);

        // Tambahkan panel ke frame
        add(panel);

        setSize(300, 100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ContohLayout();
    }
}