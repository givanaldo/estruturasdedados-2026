import java.util.ArrayList;

public class MaxHeap {
    private final ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    private int pai(int i) { return (i - 1) / 2; }
    private int filhoEsquerdo(int i) { return 2 * i + 1; }
    private int filhoDireito(int i) { return 2 * i + 2; }

    private void trocar(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Inserção (O(log n)) ---
    public void inserir(int valor) {
        // Adiciona o novo elemento no final do array (última folha da árvore)
        heap.add(valor); 
        int atual = heap.size() - 1;
        
        // Enquanto o nó atual for maior que o seu pai, eles trocam de lugar
        while (atual > 0 && heap.get(atual) > heap.get(pai(atual))) {
            trocar(atual, pai(atual));
            atual = pai(atual);
        }
    }

    // Remover o Máximo (O(log n)) ---
    public int removerMax() {
        if (heap.isEmpty()) {
            throw new RuntimeException("O Heap está vazio!");
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        // O maior elemento está sempre na raiz (índice 0)
        int max = heap.get(0);
        
        // Pega o último elemento da árvore e coloca na raiz
        heap.set(0, heap.remove(heap.size() - 1));
        
        // Reorganiza a árvore empurrando o elemento para baixo até a posição correta
        descer(0);
        
        return max;
    }

    private void descer(int i) {
        int maior = i;
        int esq = filhoEsquerdo(i);
        int dir = filhoDireito(i);

        // Se o filho esquerdo for maior que o nó atual, ele passa a ser o "maior"
        if (esq < heap.size() && heap.get(esq) > heap.get(maior)) {
            maior = esq;
        }
        // Se o filho direito for maior que o "maior" atual
        if (dir < heap.size() && heap.get(dir) > heap.get(maior)) {
            maior = dir;
        }

        // Se o maior não for mais o nó que estamos analisando, trocamos e continuamos descendo
        if (maior != i) {
            trocar(i, maior);
            descer(maior); // Chamada recursiva para continuar descendo
        }
    }

    public void imprimir() {
        System.out.println(heap);
    }

}