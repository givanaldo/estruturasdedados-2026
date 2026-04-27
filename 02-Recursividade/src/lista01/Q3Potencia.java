package lista01;

public class Q3Potencia {

    public static int potencia(int base, int expoente) {
        if (expoente == 0)
            return 1;
        return base * potencia(base, expoente - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Resultado = " + potencia(2, 10));
    }
}
