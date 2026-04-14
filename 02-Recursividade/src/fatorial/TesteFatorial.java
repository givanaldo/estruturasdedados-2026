package fatorial;

import java.util.Scanner;

public class TesteFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();

        long ini, fim;
        
        ini = System.currentTimeMillis();
        double resultado1 = Fatorial.recursivo(n);
        fim = System.currentTimeMillis();
        System.out.printf("%d! = %.0f (tempo = %d ms)\n", 
                n, resultado1, fim-ini);
        
        ini = System.currentTimeMillis();
        double resultado2 = Fatorial.iterativo(n);
        fim = System.currentTimeMillis();
        System.out.printf("%d! = %.0f (tempo = %d ms)\n", 
                n, resultado2, fim-ini);
        
    }
}
