package lista01;

public class Q8Palindroma {

    public static boolean palindromo(String palavra) {
        if (palavra.length() <= 1)
            return true;
        if (palavra.charAt(0) != palavra.charAt(palavra.length() - 1))
            return false;
        return palindromo(palavra.substring(1, palavra.length() - 1));
    }
    
    public static void main(String[] args) {
        System.out.println("arara => " + palindromo("arara"));
        System.out.println("caju => " + palindromo("caju"));
    }
}
