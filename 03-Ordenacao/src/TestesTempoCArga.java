
import java.util.Random;

public class TestesTempoCArga {
    public static void imprimirVetor(String texto, int [] v) {
        System.out.print(texto);
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " ");
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int n = 1000;
        long inicio, fim;
        Random numero = new Random();
        
        int[] vetor1 = new int[n];
        for (int i = 0; i < vetor1.length; i++)
            vetor1[i] = numero.nextInt(1000);
        
        int[] vetor2 = vetor1.clone();
        int[] vetor3 = vetor1.clone();
        int[] vetor4 = vetor1.clone();
        int[] vetor5 = vetor1.clone();
        
        imprimirVetor("Original = ", vetor1);
        inicio = System.currentTimeMillis();
        Sort.bubblesort(vetor1);
        fim = System.currentTimeMillis();
        imprimirVetor("Bubble = ", vetor1);
        System.out.println("Tempo: " + (fim - inicio) + " milisegundos\n");
        
        imprimirVetor("Original = ", vetor2);
        inicio = System.currentTimeMillis();
        Sort.selectionsort(vetor2);
        fim = System.currentTimeMillis();
        imprimirVetor("Selection = ", vetor2);
        System.out.println("Tempo: " + (fim - inicio) + " milisegundos\n");
        
        imprimirVetor("Original = ", vetor3);
        inicio = System.currentTimeMillis();
        Sort.insertionsort(vetor3);
        fim = System.currentTimeMillis();
        imprimirVetor("Insertion = ", vetor3);
        System.out.println("Tempo: " + (fim - inicio) + " milisegundos\n");

        imprimirVetor("Original = ", vetor4);
        inicio = System.currentTimeMillis();
        Sort.shellsort(vetor4);
        fim = System.currentTimeMillis();
        imprimirVetor("Shell orig = ", vetor4);
        System.out.println("Tempo: " + (fim - inicio) + " milisegundos\n");

        imprimirVetor("Original = ", vetor5);
        inicio = System.currentTimeMillis();
        Sort.shellsort2(vetor5);
        fim = System.currentTimeMillis();
        imprimirVetor("Shell = ", vetor5);
        System.out.println("Tempo: " + (fim - inicio) + " milisegundos\n");        
    }
}
