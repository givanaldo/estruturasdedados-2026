package lista01;

public class Q1 {
    public static int soma(int vetor[], int n) {
        if (n == 0)
            return 0;
        return vetor[n-1] + soma(vetor, n-1);
    }
    
    public static void main(String[] args) {
        int vetor[] = {20, 10, 50, 100};
        System.out.println("Resultado = " + soma(vetor, vetor.length));
    }
}
