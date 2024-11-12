package P07_Exception_Handling_and_Method;

public class segi4 {
    public void segiempat(int panjang, int lebar) {
        double luas;
        luas = panjang*lebar;

        System.out.println("------------------------");
        System.out.println("Panjang Segiempat = " + panjang);
        System.out.println("Lebar Segiempat = " + lebar);
        System.out.println("Luas Segiempat = " + luas);
    }

    public static void main(String args[]) {
        segi4 se=new segi4();
        se.segiempat(10, 5);
    }
}
