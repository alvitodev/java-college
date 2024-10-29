public class CetakArrayLoop {
    public static void main(String[] args) {
        int data[] = {4,5,4,2,8,4,2,11};
        int i = 0; // Inisialisasi indeks

        // Menggunakan while loop
        System.out.println("Menggunakan perulangan while:");
        while (i < data.length) {
            System.out.print(data[i] + " ");
            i++;
        } System.out.println();

        // Menggunakan do-while loop
        System.out.println("Menggunakan perulangan do-while:");
        i = 0; // Reset indeks
        do {
            System.out.print(data[i] + " ");
            i++;
        } while (i < data.length);
        System.out.println();

        // Menggunakan for loop
        System.out.println("Menggunakan perulangan for:");
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j] + " ");
        }
    }
}