package lista01;

public class Q3 {

    public static int potencia(int base, int expoente) {
        if (expoente == 0)
            return 1;
        return base * potencia(base, expoente-1);
    }
    
    public static void main(String[] args) {
        System.out.println("2^5 = " + potencia(2, 5));
    }
}
