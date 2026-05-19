
public class TesteFila {

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue(10);
        fila.enqueue(5);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(8);
        System.out.println(fila.front());
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        System.out.println(fila.front());
        fila.dequeue();
        fila.dequeue();
        System.out.println(fila.front());
    }
}
