
public class TestesSimples {
    public static void imprimirVetor(int [] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] vetor = {5, 4, 2, 3, 1};
        imprimirVetor(vetor);
        Sort.bubblesort(vetor);
        imprimirVetor(vetor);

    }
}
