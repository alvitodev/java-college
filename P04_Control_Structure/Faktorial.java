package P04_Control_Structure;
public class Faktorial {
    public static void main(String[] args) {
        long batas = 4;
        long faktorial = 1;
        for (int i = 0; i<=batas; i++) {
            faktorial = 1;
            for (int faktor = 2; faktor <= i; faktor++) 
                faktorial *= faktor;
            System.out.println(i+"!"+" adalah = "+faktorial);
            
        }
    }
}
