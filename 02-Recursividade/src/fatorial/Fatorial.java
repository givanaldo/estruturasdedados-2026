package fatorial;

public class Fatorial {

    public double fatorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * fatorial(n-1);
    }
    
}
