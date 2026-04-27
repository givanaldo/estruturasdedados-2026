package lista01;

public class Q1Soma {
    public static int somaVetor(int vetor[], int n) {
        if (n <= 0) 
            return 0;
        return vetor[n-1] + somaVetor(vetor, n-1);
    }
    
    public static void main(String[] args) {
        int vetor[] = {20, 15, 10, 30};
        int soma = somaVetor(vetor, vetor.length);
        System.out.println("Soma = " + soma);
    }
}
