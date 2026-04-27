package lista01;

public class Q5MultiplicacaoPorSomas {

    public static int multiplicacao(int n1, int n2) {
        if (n2 == 0)
            return 0;
        if (n2 < 0)
            return -multiplicacao(n1, -n2);
        return n1 + multiplicacao(n1, n2-1);
    }
}
