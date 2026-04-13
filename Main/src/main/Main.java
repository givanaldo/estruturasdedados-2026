package main;

import banco.*;

public class Main {
    public static void main(String[] args) {
        Cliente clienteComum = new Cliente("Ricardo Silva", "Av. Central, 500");

        ContaCorrente cc = new ContaCorrente(clienteComum, 100.0, 200.0);
        cc.sacar(250.0);
        cc.exibirDados();

        System.out.println("-------------------------");

        ContaPoupanca cp = new ContaPoupanca(clienteComum, 100.0);
        cp.sacar(250.0);
        cp.aplicarRendimento(10.0);
        cp.exibirDados();
    }
}