package UTS_01;
import java.util.Scanner;
public class bilSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        String jumlahbaris = input.nextLine();
        int n = Integer.parseInt(jumlahbaris);
        for (int i=1; i<=n; i++) {
            System.out.println();
            for (int j = i; j <= i; j++) {
            System.out.print(j+" ");
        }
        input.close();
    }
    }
}
