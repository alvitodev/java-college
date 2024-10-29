import javax.swing.JOptionPane;
import java.util.Scanner;

public class BangkitVariabelArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nim = Long.parseLong(JOptionPane.showInputDialog("Masukkan NIM Anda:"));
        int jumlahElemen;

        // A. B. Menentukan metode input berdasarkan NIM
        if (nim % 2 == 0) { // NIM Genap: Input menggunakan JOptionPane
            jumlahElemen = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah elemen array:"));
            int[] array = new int[jumlahElemen]; // Jumlah elemen dalam array tergantung pada input
            for (int i = 0; i < jumlahElemen; i++) {
                array[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan elemen ke-" + (i + 1)));
            }
            prosesArray(array, nim); // Lanjut ke fungsi prosesArray berdasarkan input array dan nim
        } else { // NIM Ganjil: Input menggunakan console
            System.out.print("Masukkan jumlah elemen array: ");
            jumlahElemen = scanner.nextInt(); 
            int[] array = new int[jumlahElemen]; // Jumlah elemen dalam array tergantung pada input
            for (int i = 0; i < jumlahElemen; i++) {
                System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
            prosesArray(array, nim); // Lanjut ke fungsi prosesArray berdasarkan input array dan nim
        scanner.close(); // Menutup scanner untuk mencegah memory leak
        }
    }

    public static void prosesArray(int[] array, long nim) { // Fungsi prosesArray
        // C. Mencari nilai terbesar, terkecil, dan posisi indexnya
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            // Jika nilai saat ini lebih besar dari max
            if (array[i] > max) {
                max = array[i]; // Ganti max dengan nilai saat ini
                maxIndex = i; // Set maxIndex pada index saat ini
            }
            // Jika nilai saat ini lebih besar dari max
            if (array[i] < min) {
                min = array[i]; // Ganti max dengan nilai saat ini
                minIndex = i; // Set maxIndex pada index saat ini
            }
        }

        System.out.println("Nilai terbesar: " + max + " (index ke-" + maxIndex + ")");
        System.out.println("Nilai terkecil: " + min + " (index ke-" + minIndex + ")");

        // D. Menghitung jumlah dan rata-rata semua elemen
        int jumlah = 0;
        for (int i = 0; i < array.length; i++) {
            int jumlahAwal = array[i];
            jumlah += jumlahAwal; // Menambahkan tiap nilai ke total untuk rata-rata
        }
        double average = (double) jumlah / array.length; // Menghitung rata-rata (jumlah data dibagi banyak data) dan mengonversi total ke double agar mendapat nilai pecahan
        System.out.println("Jumlah semua elemen: " + jumlah);
        System.out.println("Rata-rata: " + average);

        // E. Menjumlahkan elemen dengan index ganjil/genap berdasarkan NIM
        int jumlahGanjilGenap = 0;
        for (int i = 0; i < array.length; i++) {
            if ((nim % 2 == 0 && i % 2 == 1) || (nim % 2 == 1 && i % 2 == 0)) {
                jumlahGanjilGenap += array[i];
            }
        }
        System.out.print("Jumlah elemen dengan index ");
        if (nim % 2 == 0) {
            System.out.print("ganjil");
        } else {
            System.out.print("genap");
        }
        System.out.print(": " + jumlahGanjilGenap + "\n");

        // F. Bernilai ganjil atau genap
        System.out.print("Hasil penjumlahan tersebut ");
        if (jumlahGanjilGenap % 2 == 0) {
            System.out.print("genap\n");
        } else {
            System.out.print("ganjil\n");
        }; // Jika jumlahGanjilGenap modulo 2 = 0 (true -> genap), jika tidak (false -> ganjil)

        // G. Mengurutkan array
        System.out.print("Array setelah diurutkan: ");
        for (int i = 0; i < array.length; i++) {  
            for (int j = i + 1; j < array.length; j++) {  
                int sementara = 0;  
                if (array[i] > array[j]) {  // Jika array[n] lebih besar dari array[n+1]
                    sementara = array[i];  // Menyimpan array awal di variabel sementara
                    array[i] = array[j];  // Mengisi array awal dengan array kedua yang lebih kecil
                    array[j] = sementara;  // Mengisi array kedua dengan variabel sementara yang didapat dari array awal yang lebih besar
                }  
            } 
            System.out.print(array[i] + ", ");
        }
    }
}