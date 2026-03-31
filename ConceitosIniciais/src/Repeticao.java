
import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcao;
        do {
            System.out.print("A: ");
            int a = sc.nextInt();
            System.out.print("B: ");
            int b = sc.nextInt();
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[0] Sair");
            System.out.print("Opção --> ");
            opcao = sc.nextByte();
            int resultado = 0;
            if (opcao == 1) resultado = a + b;
            if (opcao == 2) resultado = a - b;
            if (opcao == 3) resultado = a * b;
            if (opcao == 4) resultado = a / b;
            System.out.printf("Resultado = %d\n\n", resultado);
        } while (opcao != 0);
    }

}
