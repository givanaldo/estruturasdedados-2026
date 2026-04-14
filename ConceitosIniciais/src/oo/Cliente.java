package oo;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endere\u00e7o=" + endereco + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (this.nome.isEmpty())
            this.nome = nome;
        else System.out.println("Erro, nome não está vazio.");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (this.endereco.isEmpty())
            this.endereco = endereco;
        else System.out.println("Erro, endereço não está vazio.");
    }
    
}
