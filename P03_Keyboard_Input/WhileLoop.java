package P03_Keyboard_Input;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        String angka = input.nextLine(); 
        int i = Integer.parseInt(angka);

        do {
            System.out.print(i+" ");
            i++;
        } while (i<=20);
        input.close();
    }
}
