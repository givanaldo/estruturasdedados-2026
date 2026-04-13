package banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
