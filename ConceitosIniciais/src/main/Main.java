package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // 1. Definição de variáveis
        int qtdAlunos = 3;
        int qtdNotas = 2;
        
        // Vetor para nomes e Matriz para notas
        String[] nomes = new String[qtdAlunos];
        double[][] notas = new double[qtdAlunos][qtdNotas];

        // 2. Preenchimento dos dados (Entrada)
        for (int i = 0; i < qtdAlunos; i++) {
            nomes[i] = JOptionPane.showInputDialog("Nome do aluno " + (i + 1) + ":");
            
            for (int j = 0; j < qtdNotas; j++) {
                String inputNota = JOptionPane.showInputDialog("Nota " + (j + 1) + " de " + nomes[i] + ":");
                // Conversão de String para Double
                notas[i][j] = Double.parseDouble(inputNota);
            }
        }

        // 3. Processamento e Saída
        StringBuilder relatorio = new StringBuilder("--- Relatório de Notas ---\n");
        
        for (int i = 0; i < qtdAlunos; i++) {
            double soma = 0;
            for (int j = 0; j < qtdNotas; j++) {
                soma += notas[i][j];
            }
            double media = soma / qtdNotas;
            relatorio.append(nomes[i]).append(": Média = ").append(media).append("\n");
        }

        // Exibição final
        JOptionPane.showMessageDialog(null, relatorio.toString());            
    }
    
}
