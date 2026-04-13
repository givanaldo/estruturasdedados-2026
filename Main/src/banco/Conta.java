package banco;

public abstract class Conta {
    private final Cliente titular;
    protected double saldo;

    public Conta(Cliente titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$" + valor + " para " + titular.getNome());
        }
    }

    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + titular.getNome());
        System.out.println("Endereco: " + titular.getEndereco());
        System.out.println("Saldo atual: R$" + saldo);
    }

}
