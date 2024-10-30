package Pertemuan6;
import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int data2[][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};

        // A. While & Do-while
        System.out.println("Menggunakan perulangan while:");
        int a = 0;
        int total = 0, jumlah = 0;   
        while (a < data2.length) {
            int b = 0;
            while (b < data2[0].length) {
                System.out.print(data2[a][b] + " ");
                total += data2[a][b]; // Menambah nilai ke elemen total (rata-rata)
                jumlah++; // Menambah jumlah elemen yang dihitung 
                b++;
            }
            System.out.print("\n");
            a++;
        }
        System.out.println("\nMenggunakan perulangan do-while:");
        a = 0;
        do {
            int b = 0;
            do {
                System.out.print(data2[a][b] + " ");
                b++;
            } while (b < data2[0].length);
            System.out.print("\n");
            a++;
        } while (a < data2.length);

        // B. Rata-rata
        double rataRata = (double) total / jumlah;
        System.out.println("\nRata-rata: " + rataRata);

        // C. JOptionPane mencari nilai dari index array dan menukar ke nilai baru dari input user

        String inputNilai = JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:");
        int nilaiCari = Integer.parseInt(inputNilai);
        String inputNilaiBaru = JOptionPane.showInputDialog("Masukkan nilai baru:");
        int nilaiBaru = Integer.parseInt(inputNilaiBaru);

        // Mencari dan menukar nilai
        boolean ketemu = false;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                if (data2[i][j] == nilaiCari) {
                    data2[i][j] = nilaiBaru;
                    ketemu = true;
                    JOptionPane.showMessageDialog(null, "Nilai ditemukan dan ditukar pada indeks [" + i + "][" + j + "]");
                }
            }
        }

        if (!ketemu) {
            JOptionPane.showMessageDialog(null, "Nilai tidak ditemukan");
        }

        // Output array setelah penukaran
        System.out.println("\nArray setelah penukaran:");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.print("\n");
        }

        // D. Menjumlahkan elemen dengan index kolom ganjil dan genap
        int jumlahGanjil = 0, jumlahGenap = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                if (j % 2 == 0) {
                    jumlahGenap += data2[i][j];
                } else {
                    jumlahGanjil += data2[i][j];
                }
            }
        }
        System.out.println("\nJumlah elemen dengan indeks kolom ganjil (Nim Ganjil): " + jumlahGanjil);
        System.out.println("Jumlah elemen dengan indeks kolom genap (Nim Genap): " + jumlahGenap);
    }
}
