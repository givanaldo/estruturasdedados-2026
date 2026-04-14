package fatorial;

public class Fatorial {

    public static double recursivo(int n) {
        if (n == 0)
            return 1;
        else
            return n * recursivo(n-1);
    }
    public static double iterativo(int n) {
        double resultado = 1;
        for (int i=2; i<=n; i++)
            resultado *= i;
        return resultado;
    }
}
