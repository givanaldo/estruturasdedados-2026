package soma;

import java.util.Scanner;

public class TesteSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Numero: ");
            n = sc.nextInt();
            if (n<0) System.out.println("Digite numero positivo");
        } while (n < 0);

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
