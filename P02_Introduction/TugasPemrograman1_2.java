package P02_Introduction;
public class TugasPemrograman1_2 {
    public static void main(String[] args) {
        // Tipe Data Primitif dan Ukuran Memori
        byte tipeByte = 18;  // 1 byte (8 bit)
        short tipeShort = 12381; // 2 bytes (16 bit)
        int tipeInteger = 1000000; // 4 bytes (32 bit)
        long tipeLong = 348256179000000L; // 8 bytes (64 bit)
        float tipeFloat = 3.14f; // 4 bytes (32 bit)
        double tipeDouble = 3.141592653589; // 8 bytes (64 bit)
        char huruf = 'A'; // 2 bytes (16 bit)

        // Menampilkan Nilai, Memori, dan Rentang Nilai dari masing-masing tipe data
        System.out.println("=== Tipe Data Primitif di Java");
        System.out.println("Byte: " + tipeByte + ", \t\tMemori: " + Byte.SIZE + " byte,  Rentang: " + Byte.MIN_VALUE + " hingga " + Byte.MAX_VALUE);
        System.out.println("Short: " + tipeShort + ", \t\tMemori: " + Short.SIZE + " byte, Rentang: " + Short.MIN_VALUE + " hingga " + Short.MAX_VALUE);
        System.out.println("Int: " + tipeInteger + ", \t\tMemori: " + Integer.SIZE + " byte, Rentang: " + Integer.MIN_VALUE + " hingga " + Integer.MAX_VALUE);
        System.out.println("Long: " + tipeLong + ", \tMemori: " + Long.SIZE + " byte, Rentang: " + Long.MIN_VALUE + " hingga " + Long.MAX_VALUE);
        System.out.println("Float: " + tipeFloat + ", \t\tMemori: " + Float.SIZE + " byte, Rentang: " + Float.MIN_VALUE + " hingga " + Float.MAX_VALUE);
        System.out.println("Double: " + tipeDouble + ", Memori: " + Double.SIZE + " byte,  Rentang: " + Double.MIN_VALUE + " hingga " + Double.MAX_VALUE);
        System.out.println("Char: " + huruf + ", \t\tMemori: " + Character.SIZE + " byte, Rentang: hexadesimal unicode \\u0000 sampai \\uffff (0 - 65535)");

        // Operasi Aritmatika
        System.out.println("\n=== Operasi Aritmatika");
        System.out.println("Penjumlahan (int + 100): " + (tipeInteger + 100));
        System.out.println("Pengurangan (int - 100): " + (tipeInteger - 100));
        System.out.println("Perkalian (byte * 2): " + (tipeByte * 2));
        System.out.println("Pembagian (byte / 2): " + (tipeByte / 2));
        System.out.println("Modulus (short %  2): " + (tipeShort % 2));
        System.out.println("Increment (byte +1): " + (++tipeByte));
        System.out.println("Decrement (byte -1): " + (--tipeByte));

        // Manipulasi Karakter
        System.out.println("\n=== Manipulasi Karakter");
        char hurufKedua = (char) (huruf + 2); // Menambahkan 2 nilai ASCII dari char huruf
        System.out.println("Karakter Awal: " + huruf);
        System.out.println("Karakter Setelah Ditambahkan 2: " + hurufKedua);
    }
}
