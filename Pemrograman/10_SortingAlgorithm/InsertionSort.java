import java.util.Scanner;

public class InsertionSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[10];  // Array untuk 10 angka

        // Meminta input dari pengguna
        System.out.println("Masukkan 10 angka:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // Menampilkan array sebelum sorting
        System.out.println("Data sebelum diurutkan:");
        printArray(data);

        // Memanggil metode insertionSort untuk mengurutkan array
        insertionSort(data);

        // Menampilkan array setelah sorting
        System.out.println("Data setelah diurutkan:");
        printArray(data);

        scanner.close();
    }

    // Metode untuk melakukan insertion sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            System.out.println("Key(var ke-2)= " + array[i]);
            int j = i - 1;
            System.out.println("J (var ke-1)= " + j);
            // Memindahkan elemen-elemen yang lebih besar dari key ke posisi berikutnya
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                System.out.println(("array j= ")+array[j]);
                j = j - 1;
            }
            array[j + 1] = key;
            System.out.println(("array j+1 = ")+array[j+1]);
        }
    }

    // Metode untuk menampilkan isi array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}