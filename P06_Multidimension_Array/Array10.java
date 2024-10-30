package Pertemuan6;

public class Array10 {
    public static void main(String[] args) {
        int baris, kolom;
        int[][] bil = {
            {1,2,35,7,10,73,12,3,91,3},
            {6,7,4,1,0,91,3,82,4,10}
        };
        for (baris = 0; baris < 2; baris++) {
            for (kolom = 0; kolom < 10; kolom++) {
                System.out.println("Data [" + baris + "," + kolom + "] = " + bil[baris][kolom]);
            }
        }
    }
}
