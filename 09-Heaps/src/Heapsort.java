import java.util.Arrays;

public class Heapsort {

    public static void heapSort(int[] array) {
        int n = array.length;

        // Construir o heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrair elementos do heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz, maior elemento, para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int tamanho, int raiz) {
        int maior = raiz;
        int esquerda = 2 * raiz + 1;
        int direita = 2 * raiz + 2;

        // Verifica se o filho da esquerda é maior que a raiz
        if (esquerda < tamanho && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        // Verifica se o filho da direita é maior que o maior atual
        if (direita < tamanho && array[direita] > array[maior]) {
            maior = direita;
        }

        // Se o maior não for a raiz, troca e continua ajustando
        if (maior != raiz) {
            int temp = array[raiz];
            array[raiz] = array[maior];
            array[maior] = temp;

            heapify(array, tamanho, maior);
        }
    }

    public static void main(String[] args) {
        int[] numeros = {12, 11, 13, 5, 6, 7};

        System.out.println("Antes: " + Arrays.toString(numeros));

        heapSort(numeros);

        System.out.println("Depois: " + Arrays.toString(numeros));
    }
}