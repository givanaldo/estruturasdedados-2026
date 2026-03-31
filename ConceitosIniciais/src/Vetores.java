
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();
        float medias[] = new float[n];
        String alunos[] = new String[n];
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Aluno: ");
            alunos[i] = sc.nextLine();
            System.out.print("Media: ");
            medias[i] = sc.nextFloat();
            sc.nextLine();
        }
        System.out.println("\n==LISTAGEM DE ALUNOS E MEDIAS ==");
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("%d - %s - %.1f\n", i+1, alunos[i], medias[i]);
        }
    }
}
