
import java.util.Stack;

public class DecParaBin {
    public static String decParaBin(int numero) {
        Stack<Integer> pilha = new Stack<>();
        int quociente = numero, resto;
        String binario = "";
        while (quociente > 0) {
            resto = quociente % 2;
            pilha.push(resto);
            quociente = quociente / 2;
        }
        while (!pilha.isEmpty())
            binario += pilha.pop();
        return binario;
    }
    
    public static void main(String[] args) {
        System.out.println("11 => " + decParaBin(11));
        System.out.println("63 => " + decParaBin(63));
    }
}
