package lista01;

public class Q2ContagemRegressiva {
    public static void contagemRegressiva(int n) {
        if (n < 0)
            return;
        System.out.println(n);
        contagemRegressiva(n-1);
    }
    
    public static void main(String[] args) {
        int n = 100;
        contagemRegressiva(n);
    }
}
