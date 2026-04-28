package lista01;

public class Q9FibonnaciEficiente {

    private static long[] memo;

    public static long fibonacciEficiente(int n) {
        memo = new long[n + 1];
        return calcularFib(n);
    }

    private static long calcularFib(int n) {
        if (n <= 1)
            return n;
        if (memo[n] != 0)
            return memo[n];
        memo[n] = calcularFib(n - 1) + calcularFib(n - 2);
        return memo[n];
    }
    
    public static void main(String[] args) {
        System.out.println("Fib(50) = " + fibonacciEficiente(50));
    }
}
