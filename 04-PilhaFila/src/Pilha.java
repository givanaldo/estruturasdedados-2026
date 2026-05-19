import java.util.ArrayList;

public class Pilha {
    private final ArrayList<Integer> pilha;
    
    public Pilha() {
        pilha = new ArrayList<>();
    }
     
    public void push(Integer numero) {
        pilha.add(numero);
    }
    
    public Integer pop() {
        if (isEmpty())
            return null;
        else
            return pilha.remove(pilha.size()-1);
    }
    
    public Integer top() {
        if (isEmpty())
            return null;
        else
            return pilha.get(pilha.size()-1);
    }
    
    public int size() {
        return pilha.size();
    }
    
    public boolean isEmpty() {
        return pilha.isEmpty();
    }    
}
