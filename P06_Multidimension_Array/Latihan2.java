package Pertemuan6;

public class Latihan2 {
    public static void main(String[] args) {
        char[] ganjil = {'Q','W','E','R','T',
                         'Y','U','I','O','P',
                         'A','S','D','F','G',
                         'H','J','K','L','Z'};
        System.out.print("Nilai pada index ganjil adalah: ");
        for (int i = 1; i < ganjil.length; i+=2) { 
            System.out.print(ganjil[i]+" ");
        }
    }
}
