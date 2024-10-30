package P03_Keyboard_Input;
public class ListingNilaiUjian {
  public static void main(String[] args) {
      // Data mahasiswa
      String[] nama = {"Adi", "Budi", "Caca", "Deny"};
      int[] nilai = {70, 65, 90, 75};
      
      System.out.println("_________________________");
      System.out.println("| Nama\t| Nilai\t| Huruf |");

      // Menyimpan informasi nilai tertinggi dan terendah dan nama mahasiswa
      int nilaiTertinggi = nilai[0];
      int nilaiTerendah = nilai[0];
      String namaNilaiTertinggi = nama[0];
      String namaNilaiTerendah = nama[0];

      // Operasi pemberian nilai huruf
      for (int i = 0; i < nilai.length; i++) {
          String huruf = hitungNilai(nilai[i]);
          System.out.println("| "+ nama[i] + "\t| " + nilai[i] +"\t| " + huruf + "\t|");

          // Memeriksa nilai tertinggi
          if (nilai[i] > nilaiTertinggi) {
              nilaiTertinggi = nilai[i];
              namaNilaiTertinggi = nama[i];
          }

          // Memeriksa nilai terendah
          if (nilai[i] < nilaiTerendah) {
              nilaiTerendah = nilai[i];
              namaNilaiTerendah = nama[i];
          }
      }

      // Menampilkan hasil mahasiswa dengan nilai tertinggi dan terendah
      System.out.println("\nNilai terendah: " + namaNilaiTerendah + " (" + nilaiTerendah + ")");
      System.out.println("Nilai tertinggi: " + namaNilaiTertinggi + " (" + nilaiTertinggi + ")");
  }

  // Fungsi untuk menentukan nilai huruf berdasarkan skor
  public static String hitungNilai(int score) {
      if (score >= 86 && score <= 100) {
          return "A";
      } else if (score >= 76 && score <= 85) {
          return "B+";
      } else if (score >= 66 && score <= 75) {
          return "B";
      } else if (score >= 56 && score <= 65) {
          return "C+";
      } else if (score >= 46 && score <= 55) {
          return "C";
      } else if (score >= 36 && score <= 45) {
          return "D";
      } else {
          return "Nilai tidak valid";
      }
  }
}
