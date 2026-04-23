package fibonacci;

public class TesteFibonacci {
    public static void main(String[] args) {
        int n = 45;
        System.out.printf("F(%d) = %d (iterativo)\n\n", 
                n, Fibonacci.fibonacciIterativo(n));

        System.out.printf("F(%d) = %d (recursivo)\n\n", 
                n, Fibonacci.fibonacciRecursivo(n));

    }
}
