
public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(5);
        pilha.push(2);
        pilha.push(3);
        pilha.push(8);
        System.out.println(pilha.top());
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.top());
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.top());
    }
}
