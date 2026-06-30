public class MaxHeapMain {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        
        maxHeap.inserir(10);
        maxHeap.inserir(20);
        maxHeap.inserir(5);
        maxHeap.inserir(30);
        maxHeap.inserir(15);

        System.out.println("Estrutura do Array apos insercoes:");
        maxHeap.imprimir();

        System.out.println("\nExtraindo o maior: " + maxHeap.removerMax());
        System.out.println("Estrutura do Array apos extracao:");
        maxHeap.imprimir();
    }    
}
