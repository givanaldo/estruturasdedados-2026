package lista01;

public class Q10BuscaBinaria {

    public static int buscaBinaria(int[] vetor, int inicio, int fim, int alvo) {
        if (inicio > fim)
            return -1;

        int meio = inicio + (fim - inicio) / 2;

        if (vetor[meio] == alvo)
            return meio;

        if (alvo < vetor[meio])
            return buscaBinaria(vetor, inicio, meio - 1, alvo);

        return buscaBinaria(vetor, meio + 1, fim, alvo);
    }
    
    public static void main(String[] args) {
        int vetor[] = {10, 20, 30, 40, 50};
        System.out.println("Indice de 40 = " + buscaBinaria(vetor, 0, 4, 40));
    }
}
