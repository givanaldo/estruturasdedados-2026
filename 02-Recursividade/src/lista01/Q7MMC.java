package lista01;

public class Q7MMC {

    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    public static int mmc(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return Math.abs(a * b) / mdc(a, b);
    }
    
    public static void main(String[] args) {
        System.out.println("Resultado = " + mmc(50, 15));
    }
}
