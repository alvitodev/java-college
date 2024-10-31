package P07_Exception_Handling_and_Method;

public class segiempat {
    public void segiempat(int panjang, int lebar) {
        double luas;
        luas = panjang*lebar;

        System.out.println("------------------------");
        System.out.println("Panjang Segiempat = " + panjang);
        System.out.println("Lebar Segiempat = " + lebar);
        System.out.println("Luas Segiempat = " + luas);
    }

    public static void main(String args[]) {
        segiempat se=new segiempat();
        se.segiempat(10, 5);
    }
}
