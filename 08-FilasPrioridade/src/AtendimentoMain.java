import java.util.PriorityQueue;

public class AtendimentoMain {

    public static void main(String[] args) {
        
        PriorityQueue<Paciente> filaAtendimento = new PriorityQueue<>();

        filaAtendimento.add(new Paciente(3, "Roberto (Atendimento Geral)"));
        filaAtendimento.add(new Paciente(1, "Carmem (Idosa)"));
        filaAtendimento.add(new Paciente(3, "Lucas (Atendimento Geral)"));
        filaAtendimento.add(new Paciente(2, "Mateus (Paciente com NEE)"));
        filaAtendimento.add(new Paciente(1, "Fernanda (Idosa)"));

        System.out.println("--- Painel de Chamada da Clinica ---");

        while (!filaAtendimento.isEmpty()) {
            Paciente paciente = filaAtendimento.remove();
            System.out.println("Chamando paciente: " + paciente.getNome() + 
                               " | Categoria: " + paciente.getChavePrioridade());
        }
    }
}