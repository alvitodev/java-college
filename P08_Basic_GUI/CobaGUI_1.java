package P08_Basic_GUI;
import javax.swing.*;
import java.awt.*;
class CobaGUI_1 extends JFrame {
    Button cbl = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");

    CobaGUI_1() {
        setTitle("Program GUI Pertamaku");
        setLocation(200, 100);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cbl.setBackground(Color.MAGENTA);
        getContentPane().add(cbl);
        getContentPane().add(cb2);
        setVisible(true);
    }

    public static void main(String args[]) {
        CobaGUI_1 ZZ = new CobaGUI_1();
        ZZ.objek();
    }
}