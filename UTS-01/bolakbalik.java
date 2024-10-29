package UTS;
import java.util.Scanner;

public class bolakbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah telur ");
        String angka = input.nextLine();
        int i = Integer.parseInt(angka);
        int j = i / 5;
        System.out.println("Dia harus bolak balik sebanyak " + j + " kali");
    }
}
