import java.util.PriorityQueue;

public class AtendimentoMain {

    public static void main(String[] args) {
        
        // Como 'Paciente' é Comparable, não precisamos mais passar um Comparator!
        PriorityQueue<Paciente> filaAtendimento = new PriorityQueue<>();

        filaAtendimento.add(new Paciente(2, "Roberto (Atendimento Geral)"));
        filaAtendimento.add(new Paciente(1, "Dona Carmem (Idosa)"));
        filaAtendimento.add(new Paciente(2, "Lucas (Atendimento Geral)"));
        filaAtendimento.add(new Paciente(1, "Mateus (Paciente com NEE)"));
        filaAtendimento.add(new Paciente(2, "Fernanda (Atendimento Geral)"));

        System.out.println("--- Painel de Chamada da Clinica ---");

        while (!filaAtendimento.isEmpty()) {
            Paciente paciente = filaAtendimento.remove();
            System.out.println("Chamando paciente: " + paciente.getNome() + 
                               " | Categoria: " + paciente.getChavePrioridade());
        }
    }
}