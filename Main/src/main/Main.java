package main;
import banco.Cliente;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
        // faz de conta que usei Scanner
        cliente = new Cliente("Fulano Dital",
                "Rua da Esperança, 25 - Parnamirim");
        System.out.println(cliente.toString());
        cliente.setNome("Beltrano da Silva");
        System.out.println(cliente.toString());
    }
    
}
