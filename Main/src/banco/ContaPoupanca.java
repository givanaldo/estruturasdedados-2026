package banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na Poupança.");
            return true;
        }
        System.out.println("Saldo insuficiente na Poupança para o saque de R$" + valor);
        return false;
    }

    public void aplicarRendimento(double taxa) {
        this.saldo += this.saldo * (taxa / 100);
    }
}
