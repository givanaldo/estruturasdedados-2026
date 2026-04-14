package soma;

import java.util.Scanner;

public class TesteSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();

        long ini, fim;
        
        ini = System.currentTimeMillis();
        double resultado1 = Soma.recursivo(n);
        fim = System.currentTimeMillis();
        System.out.printf("Soma(%d) = %.0f (tempo = %d ms)\n", 
                n, resultado1, fim-ini);
        
        ini = System.currentTimeMillis();
        double resultado2 = Soma.iterativo(n);
        fim = System.currentTimeMillis();
        System.out.printf("Soma(%d) = %.0f (tempo = %d ms)\n", 
                n, resultado2, fim-ini);
        
    }
}
