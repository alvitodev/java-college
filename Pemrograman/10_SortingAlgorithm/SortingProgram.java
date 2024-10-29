import java.util.*; 
import java.io.*; 

public class SortingProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah elemen yang akan diurutkan
        System.out.println("Masukkan jumlah elemen:");
        int n = scanner.nextInt();  // Membaca input jumlah elemen
        int[] array = new int[n];   // Membuat array dengan ukuran n

        // Input elemen-elemen array
        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();  // Membaca elemen-elemen array
        }

        // Pilih algoritma sorting
        System.out.println("Pilih algoritma sorting:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        int pilihan = scanner.nextInt();  // Membaca pilihan algoritma

        // Variabel untuk menghitung waktu eksekusi
        long startTime, endTime;

        switch (pilihan) {
            case 1:
                startTime = System.nanoTime();  // Mencatat waktu sebelum sorting
                bubbleSort(array);              // Menjalankan Bubble Sort
                endTime = System.nanoTime();    // Mencatat waktu setelah sorting
                System.out.println("Bubble Sort digunakan.");
                printKompleksitas("Bubble Sort", "O(n)", "O(n^2)", "O(n^2)");  // Mencetak analisis kompleksitas
                break;
            case 2:
                startTime = System.nanoTime();  // Mencatat waktu sebelum sorting
                quickSort(array, 0, array.length - 1);  // Menjalankan Quick Sort
                endTime = System.nanoTime();    // Mencatat waktu setelah sorting
                System.out.println("Quick Sort digunakan.");
                printKompleksitas("Quick Sort", "O(n log n)", "O(n log n)", "O(n^2)");  // Mencetak analisis kompleksitas
                break;
            case 3:
                startTime = System.nanoTime();  // Mencatat waktu sebelum sorting
                array = mergeSort(array);       // Menjalankan Merge Sort
                endTime = System.nanoTime();    // Mencatat waktu setelah sorting
                System.out.println("Merge Sort digunakan.");
                printKompleksitas("Merge Sort", "O(n log n)", "O(n log n)", "O(n log n)");  // Mencetak analisis kompleksitas
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        // Menampilkan hasil pengurutan
        System.out.println("Hasil pengurutan:");
        System.out.println(Arrays.toString(array));  // Mencetak array yang sudah diurutkan

        // Menghitung dan menampilkan waktu eksekusi
        long executionTime = endTime - startTime;  // Menghitung waktu eksekusi
        System.out.println("Waktu eksekusi: " + executionTime + "ns");  // Menampilkan waktu eksekusi

        // Menyimpan hasil ke file teks
        saveFile(array);  // Menyimpan hasil array yang sudah diurutkan ke dalam file
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elemen jika elemen yang sekarang lebih besar dari elemen berikutnya
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(int[] array, int kecil, int besar) {
        if (kecil < besar) {
            int pivotIndex = partition(array, kecil, besar);  // Mempartisi array
            quickSort(array, kecil, pivotIndex - 1);          // Quick Sort bagian kiri
            quickSort(array, pivotIndex + 1, besar);          // Quick Sort bagian kanan
        }
    }

    // Fungsi untuk mempartisi array dalam Quick Sort
    public static int partition(int[] array, int kecil, int besar) {
        int pivot = array[besar];  // Menetapkan elemen terakhir sebagai pivot
        int i = kecil - 1;  // Indeks elemen lebih kecil dari pivot
        for (int j = kecil; j < besar; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap elemen
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap pivot ke posisi yang benar
        int temp = array[i + 1];
        array[i + 1] = array[besar];
        array[besar] = temp;
        return i + 1;  // Mengembalikan indeks pivot
    }

    // Implementasi Merge Sort
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;  // Jika panjang array <= 1, sudah tersortir
        }
        int mid = array.length / 2;  // Membagi array menjadi dua
        int[] kiri = Arrays.copyOfRange(array, 0, mid);  // Bagian kiri
        int[] kanan = Arrays.copyOfRange(array, mid, array.length);  // Bagian kanan

        kiri = mergeSort(kiri);  // Rekursif mengurutkan bagian kiri
        kanan = mergeSort(kanan);  // Rekursif mengurutkan bagian kanan

        return merge(kiri, kanan);  // Menggabungkan kedua bagian yang sudah diurutkan
    }

    // Fungsi untuk menggabungkan dua bagian dalam Merge Sort
    public static int[] merge(int[] kiri, int[] kanan) {
        int[] result = new int[kiri.length + kanan.length];  // Membuat array baru untuk hasil gabungan
        int i = 0, j = 0, k = 0;
        while (i < kiri.length && j < kanan.length) {
            if (kiri[i] <= kanan[j]) {
                result[k++] = kiri[i++];
            } else {
                result[k++] = kanan[j++];
            }
        }
        while (i < kiri.length) {
            result[k++] = kiri[i++];  // Menambahkan elemen sisa dari bagian kiri
        }
        while (j < kanan.length) {
            result[k++] = kanan[j++];  // Menambahkan elemen sisa dari bagian kanan
        }
        return result;  // Mengembalikan hasil gabungan
    }

    // Mencetak analisis kompleksitas dari algoritma yang dipilih
    public static void printKompleksitas(String algoritma, String caseTerbaik, String caseRataRata, String caseTerburuk) {
        System.out.println("Analisis Kompleksitas Waktu " + algoritma + ":");
        System.out.println("Kasus Terbaik: " + caseTerbaik);
        System.out.println("Kasus Rata-rata: " + caseRataRata);
        System.out.println("Kasus Terburuk: " + caseTerburuk);
    }

    // Menyimpan hasil array yang sudah diurutkan ke dalam file
    public static void saveFile(int[] array) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("hasil_sort.txt"));
        writer.write("Hasil pengurutan:\n");
        for (int num : array) {
            writer.write(num + " ");  // Menulis setiap elemen array ke dalam file
        }
        writer.newLine();  // Menambahkan baris baru
        writer.close();  // Menutup writer
        System.out.println("Hasil telah disimpan ke file hasil_sort.txt");
    }
}
