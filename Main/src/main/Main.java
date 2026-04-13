package main;

import banco.*;

public class Main {
    public static void main(String[] args) {
        // Criando o Cliente
        Cliente clienteComum = new Cliente("Ricardo Silva", "Av. Central, 500");

        // Testando Conta Corrente (com limite)
        ContaCorrente cc = new ContaCorrente(clienteComum, 100.0, 200.0);
        cc.sacar(250.0); // Deve permitir (usa o limite)
        cc.exibirDados();

        System.out.println("-------------------------");

        // Testando Conta Poupança (sem limite)
        ContaPoupanca cp = new ContaPoupanca(clienteComum, 100.0);
        cp.sacar(250.0); // Deve negar (não tem limite)
        cp.aplicarRendimento(10.0); // Rende 10% sobre os 100.0
        cp.exibirDados();
    }
}