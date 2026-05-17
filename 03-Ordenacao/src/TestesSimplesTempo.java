
import java.util.Random;

public class TestesSimplesTempo {
    public static void imprimirVetor(String texto, int [] v) {
        System.out.print(texto);
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " ");
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int n = 10000;
        long inicio, fim;
        Random numero = new Random();
        
        int[] vetor1 = new int[n];
        for (int i = 0; i < vetor1.length; i++)
            vetor1[i] = numero.nextInt(10000);
        
        int[] vetor2 = vetor1.clone();
        int[] vetor3 = vetor1.clone();
        int[] vetor4 = vetor1.clone();
        int[] vetor5 = vetor1.clone();
        
        inicio = System.currentTimeMillis();
        Sort.bubblesort(vetor1);
        fim = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (fim - inicio) + " milisegundos");
        
        inicio = System.currentTimeMillis();
        Sort.selectionsort(vetor2);
        fim = System.currentTimeMillis();
        System.out.println("Selection sort: " + (fim - inicio) + " milisegundos");
        
        inicio = System.currentTimeMillis();
        Sort.insertionsort(vetor3);
        fim = System.currentTimeMillis();
        System.out.println("Insertion sort: " + (fim - inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        Sort.shellsort(vetor4);
        fim = System.currentTimeMillis();
        System.out.println("Shell sort original: " + (fim - inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        Sort.shellsort2(vetor5);
        fim = System.currentTimeMillis();
        System.out.println("Shell sort gap otimizado: " + (fim - inicio) + " milisegundos");        
    }
}
