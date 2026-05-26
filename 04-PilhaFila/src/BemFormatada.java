import java.util.Stack;

public class BemFormatada {
    public static boolean verificarFormato(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < expressao.length(); i++) {        
            if (expressao.charAt(i) == '(' || expressao.charAt(i) == '[' ||
                expressao.charAt(i) == '{') {
                pilha.push(expressao.charAt(i));
            }
            else {
                if (expressao.charAt(i) == ')')
                    if (pilha.pop() != '(') 
                        return false;
                if (expressao.charAt(i) == ']')
                    if (pilha.pop() != '[') 
                        return false;
                if (expressao.charAt(i) == '}')
                    if (pilha.pop() != '{') 
                        return false;                
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("(2+4)*2+(5+8) => " + verificarFormato("(2+4)*2+(5+8)"));
        System.out.println("{(2+4)*2]}+[(5+8)/2] => " + verificarFormato("{(2+4)*2]}+[(5+8)/2]"));
    }
}
