public class CobaDoWhile {
    public static void main(String[] args) {
        double r=0;
        do {
            r = Math.random();
            System.out.println(r);
        } while (r<0.99d);
    }
}
