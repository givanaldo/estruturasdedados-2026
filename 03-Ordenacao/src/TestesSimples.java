
public class TestesSimples {
    public static void imprimirVetor(String texto, int [] v) {
        System.out.print(texto);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] vetor1 = {5, 10, 4, 2, 3, 1, 23};
        int[] vetor2 = vetor1.clone();
        
        imprimirVetor("Original = ", vetor1);
        Sort.bubblesort(vetor1);
        imprimirVetor("Ordenado = ", vetor1);
        
        imprimirVetor("Original = ", vetor2);
        Sort.selectionsort(vetor2);
        imprimirVetor("Ordenado = ", vetor2);
        
        
    }
}
