package P07_Exception_Handling_and_Method;

public class metodx {
    // Fungsi
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    // Prosedur
    public void hitungLuasLingkaran(int jari2) {
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println(luas);
    }

    public static void main(String[] args) {
        metodx mt = new metodx();
        mt.hitungLuasLingkaran(10);
        System.out.print(mt.luas_lingkaran(20));
        System.exit(0);
    }
}