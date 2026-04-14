package soma;

public class Soma {

    public static double recursivo(int n) {
        if (n == 1)
            return 1;
        else
            return n + recursivo(n-1);
    }
    public static double iterativo(int n) {
        double resultado = 1;
        for (int i=2; i<=n; i++)
            resultado += i;
        return resultado;
    }
}
