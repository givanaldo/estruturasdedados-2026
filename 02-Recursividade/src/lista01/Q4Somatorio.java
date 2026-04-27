package lista01;

public class Q4Somatorio {

    public static int somatorio(int n) {
        if (n <= 1)
            return n;
        return n + somatorio(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println("Resultado = " + somatorio(10));
    }
    
}
