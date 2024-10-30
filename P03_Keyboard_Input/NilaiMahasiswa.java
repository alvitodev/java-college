import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];
        String[] grade = new String[10];
        int maxIndex = 0;
        int minIndex = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            
            // Menentukan grade berdasarkan nilai
            if (nilai[i] >= 86 && nilai[i] <= 100) {
                grade[i] = "A";
            } else if (nilai[i] >= 76 && nilai[i] <= 85) {
                grade[i] = "B+";
            } else if (nilai[i] >= 66 && nilai[i] <= 75) {
                grade[i] = "B";
            } else if (nilai[i] >= 56 && nilai[i] <= 65) {
                grade[i] = "C+";
            } else if (nilai[i] >= 46 && nilai[i] <= 55) {
                grade[i] = "C";
            } else if (nilai[i] >= 36 && nilai[i] <= 45) {
                grade[i] = "D";
            } else {
                grade[i] = "E"; // Nilai di bawah 36 otomatis E
            }
            
            // Menentukan nilai terbesar dan terkecil
            if (nilai[i] > nilai[maxIndex]) {
                maxIndex = i;
            }
            if (nilai[i] < nilai[minIndex]) {
                minIndex = i;
            }
        }
        input.close();

        // Menampilkan hasil
        System.out.println("\nHasil Penilaian:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " dengan nilai: " + nilai[i] + " mendapat grade: " + grade[i]);
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah Mahasiswa ke-" + (maxIndex + 1) + " dengan nilai " + nilai[maxIndex]);
        System.out.println("Mahasiswa dengan nilai terendah adalah Mahasiswa ke-" + (minIndex + 1) + " dengan nilai " + nilai[minIndex]);
    }
}