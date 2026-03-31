package banco;

public class Cliente {
    private String nome;
    private String endereço;

    public Cliente(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endere\u00e7o=" + endereço + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
