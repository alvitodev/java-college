import javax.swing.JOptionPane;

public class PosisiIndexArray {
    public static void main(String[] args) {
        int data[] = {4,5,4,2,8,4,2,11};
        String posisiN = JOptionPane.showInputDialog("Masukkan nilai untuk mencari posisi index:"); //Input JOptionPane
        int n = Integer.parseInt(posisiN); //Menaruh input kedalam n

        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) { // Mencari data pada array
                JOptionPane.showMessageDialog(null, "Posisi index nilai "+posisiN+ " adalah ke- "+ i);
                ditemukan = true;
            }
        }

        // Jika nilai tidak ditemukan
        if (!ditemukan) {
            JOptionPane.showMessageDialog(null, "Nilai " + n + " tidak ditemukan dalam array.");
        }
    }
}
