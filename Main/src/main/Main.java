package main;
import banco.Cliente;
import banco.Conta;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
        // faz de conta que usei Scanner
        cliente = new Cliente("Fulano Dital",
                "Rua da Esperança, 25 - Parnamirim");
        Conta conta1 = new Conta(cliente, 12345, 200);
        Conta conta2 = new Conta(cliente, 00225);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
    
}
