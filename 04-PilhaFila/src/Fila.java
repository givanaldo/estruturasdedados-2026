import java.util.ArrayList;

public class Fila {
    private final ArrayList<Integer> fila;
    
    public Fila() {
        fila = new ArrayList<>();
    }
     
    public void enqueue(Integer numero) {
        fila.add(numero);
    }
    
    public Integer dequeue() {
        if (isEmpty())
            return null;
        else
            return fila.remove(0);
    }
    
    public Integer front() {
        if (isEmpty())
            return null;
        else
            return fila.get(0);
    }
    
    public int size() {
        return fila.size();
    }
    
    public boolean isEmpty() {
        return fila.isEmpty();
    }    
}
