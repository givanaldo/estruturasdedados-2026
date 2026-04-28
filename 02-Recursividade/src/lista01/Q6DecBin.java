package lista01;

public class Q6DecBin {

    public static String decimalParaBinario(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return decimalParaBinario(n / 2) + (n % 2);
    }
    
    public static void main(String[] args) {
        System.out.println("Resultado = " + decimalParaBinario(10));
    }
}
