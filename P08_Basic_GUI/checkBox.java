package P08_Basic_GUI;
import javax.swing.*;
import java.awt.*;

public class checkBox extends JFrame {
    Checkbox unta = new Checkbox("Nama kamu siapa");
    Checkbox kuda = new Checkbox("Nama kamu Anton");
    Checkbox kuda2 = new Checkbox("Nama kamu Wong");
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    checkBox(){
        super("PROGRAM MENGHITUNG ZAKAT");
        setLocation(200,100);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek() {
        getContentPane().setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(kuda2);
        unta.setBounds(30,90,150,20);
        kuda.setBounds(30,120,150,20);
        kuda2.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String[] args) {
        checkBox ZZ = new checkBox();
        ZZ.objek();
    }
}
