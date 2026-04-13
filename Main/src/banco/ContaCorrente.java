package banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public void setLimite(double limite) {
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

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Limite: R$" + limite);
        System.out.println("Total de saldo: R$" + (saldo + limite));
    }
    
    
    
}
