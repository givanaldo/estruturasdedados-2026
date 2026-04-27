package lista01;

public class Q2 {
    public static void contagemRegressiva(int n) throws InterruptedException {
        if (n == 0)
            return;
        System.out.println(n);
        Thread.sleep(1000);
        contagemRegressiva(n-1);
    }
    
    public static void main(String[] args) throws InterruptedException {
        contagemRegressiva(10);
    }
}
