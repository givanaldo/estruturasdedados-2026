package banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void aplicarRendimento(double taxa) {
        this.saldo += this.saldo * (taxa / 100);
    }
}
