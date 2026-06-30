// Implementa a interface Comparable
class Passageiro implements Comparable<Passageiro> {
    
    private final String nome;
    private final int codigoPrioridade; // 1 = First Class, 2 = Business Class, 3 = Economy Class
    private final String nomeClasse;

    public Passageiro(String nome, int codigoPrioridade, String nomeClasse) {
        this.nome = nome;
        this.codigoPrioridade = codigoPrioridade;
        this.nomeClasse = nomeClasse;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoPrioridade() {
        return codigoPrioridade;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    @Override
    public int compareTo(Passageiro outroPassageiro) {
        // Quanto menor o número do código, maior a prioridade no embarque
        return Integer.compare(this.codigoPrioridade, outroPassageiro.codigoPrioridade);
    }
}
