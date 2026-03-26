package main;

import javax.swing.JOptionPane;

public class MainAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao Silva", "20231010");

        Pessoa p = new Aluno("Maria Oliveira", "20232020");

        aluno1.exibirDados();
        p.exibirDados();
        
        JOptionPane.showMessageDialog(null, "Objetos criados com sucesso no sistema!");
    }
}
