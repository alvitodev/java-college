package P04_Control_Structure;

public class Nomor2A {
    public static void main(String[] args) {
        int base1 = 4, power1 = 3, 
            base2 = 5, power2 = 2, 
            result1 = 1, result2 = 1; 
 
        for (power1 = 3; power1 != 0; power1--) {
            result1 = result1 * base1;
        }
 
        for (power2 = 2; power2 != 0; power2--) {
            result2 = result2 * base2;
        }
        
        int result = result1+result2;
        System.out.println("Hasil 4^3+5^2 = " + result);
    }
}
