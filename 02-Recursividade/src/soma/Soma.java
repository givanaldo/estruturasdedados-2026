package soma;

public class Soma {

    public static double recursivo(int n) {
        if (n == 0)
            return 0;
        else
            return n + recursivo(n-1);
    }
    public static double iterativo(int n) {
        double resultado = 0;
        for (int i=1; i<=n; i++)
            resultado += i;
        return resultado;
    }
}
