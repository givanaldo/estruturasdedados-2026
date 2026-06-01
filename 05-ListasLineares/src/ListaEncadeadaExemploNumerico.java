import java.util.LinkedList;
import java.util.Random;

public class ListaEncadeadaExemploNumerico {

    public static void imprimeLista(LinkedList<Integer> lista) {
        for (Integer elemento : lista)
           System.out.print(elemento + " ");    
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // Criação de uma lista linear
        LinkedList<Integer> lista = new LinkedList<>();
        Random numero = new Random();
        Integer n = 0;
        for (int i = 0; i < 10; i++) {
            do { n = numero.nextInt(100); } while (lista.contains(n));
            lista.add(n);
        }  
        imprimeLista(lista);      
        lista.add(5, 120);
        imprimeLista(lista);
        System.out.println(lista.get(5));
        System.out.println(lista.indexOf(77));
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        lista.remove(2);
        lista.removeLast();
        imprimeLista(lista);
    }
}
