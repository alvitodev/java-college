package UTS;
public class bilPrima {
    public static void main(String[] args) {
        System.out.print("Bilangan prima dari 1-100: ");
        for (int i=1; i < 100; i++) {
            boolean apakahPrima = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0){
                    apakahPrima = false;
                    break;
                }
            }
            if(apakahPrima)
            System.out.print(i + " ");
        }
    }
}