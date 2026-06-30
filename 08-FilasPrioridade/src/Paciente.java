class Paciente implements Comparable<Paciente> {
    
    private final int chavePrioridade;
    private final String nome;

    public Paciente(int chavePrioridade, String nome) {
        this.chavePrioridade = chavePrioridade;
        this.nome = nome;
    }

    public int getChavePrioridade() {
        return chavePrioridade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Paciente outroPaciente) {
        // Retorna um valor negativo se a prioridade deste for menor que a do outro,
        // zero se forem iguais, ou positivo se for maior.
        return Integer.compare(this.chavePrioridade, outroPaciente.chavePrioridade);                
    }
}
