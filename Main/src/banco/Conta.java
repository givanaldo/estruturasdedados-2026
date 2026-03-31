package banco;

public class Conta {
    private Cliente cliente;
    private int numero;
    private float saldo;

    @Override
    public String toString() {
        return "Conta{" + "cliente=" + cliente + ", numero=" + numero + ", saldo=" + saldo + '}';
    }

    public Conta(Cliente cliente, int numero, float saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }
    
}
