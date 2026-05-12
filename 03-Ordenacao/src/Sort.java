
import java.util.Arrays;

public class Sort {
    public static void bubblesort(int[] v) {
        int n = v.length;
        for (int i=0; i <= n-2; i++) {
            for (int j=0; j <= n-2-i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
                System.out.println(Arrays.toString(v)); // passo-a-passo
            }
        }
    }
    
    public static void selectionsort(int[] v) {
        int n = v.length;
        for (int i=0; i <= n-2; i++) {
            for (int j=i+1; j <= n-1; j++) {
                if (v[i] > v[j]) {
                    int aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
                // Mostra passo-a-passo
                System.out.println(Arrays.toString(v)); 
            }
        }
    }    
}
