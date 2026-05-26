import java.util.Stack;

public class TestePilhaLivro {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
        
        pilha.push(new Livro("Java Como Programar", "Deitel", "Ed. Fantasma"));
        pilha.push(new Livro("Star Wars 15", "George Lucas", "Ed. Darth Vader"));
        
        try {
            System.out.println("Topo: " + pilha.pop());
            System.out.println("Topo: " + pilha.peek());
            System.out.println("Topo: " + pilha.pop());
            System.out.println("Topo: " + pilha.peek());
        } catch (Exception e) {
            System.out.println("Pilha vazia: " + e.toString());
        }
        System.out.println("continua...");
    }
}
