import java.util.PriorityQueue;

public class EmbarqueMain {

    public static void main(String[] args) {
        
        // A PriorityQueue é instanciada vazia, pois ela confiará na ordenação natural do objeto Passageiro
        PriorityQueue<Passageiro> filaDeEmbarque = new PriorityQueue<>();

        // Simulando a chegada desordenada de passageiros no portão de embarque
        filaDeEmbarque.add(new Passageiro("Jorge", 3, "Economy Class"));
        filaDeEmbarque.add(new Passageiro("Maria", 1, "First Class"));
        filaDeEmbarque.add(new Passageiro("Carlos", 2, "Business Class"));
        filaDeEmbarque.add(new Passageiro("Ana", 1, "First Class"));
        filaDeEmbarque.add(new Passageiro("Pedro", 3, "Economy Class"));

        System.out.println("--- Iniciando a Chamada para Embarque (Abordagem OO) ---");

        // O laço remove e apresenta os elementos respeitando o Min-Heap estruturado internamente
        while (!filaDeEmbarque.isEmpty()) {
            Passageiro passageiro = filaDeEmbarque.remove();
            
            System.out.println("Embarcando: " + passageiro.getNome() + 
                               " | Tipo de Assento: " + passageiro.getNomeClasse() + 
                               " | Codigo: " + passageiro.getCodigoPrioridade());
        }
    }
}