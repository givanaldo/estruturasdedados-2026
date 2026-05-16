
import java.util.Arrays;

public class Sort {

    public static void bubblesort(int[] v) {
        int n = v.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
                System.out.println(Arrays.toString(v)); // passo-a-passo
            }
        }
    }

    public static void selectionsort(int[] v) {
        int n = v.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (v[i] > v[j]) {
                    int aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
                System.out.println(Arrays.toString(v)); // passo-a-passo
            }
        }
    }

    public static void insertionsort(int[] v) {
        int n = v.length;
        for (int i = 1; i <= n - 1; i++) {
            int aux = v[i];
            int j = i - 1;
            while (j >= 0 && aux < v[j]) {
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = aux;
            System.out.println(Arrays.toString(v)); // passo-a-passo
        }
    }

    public static void shellsort(int[] v) {
        int n = v.length;
        int gap = n / 2;
        int aux, j;

        while (gap > 0) {
            for (int i = gap; i <= n - 1; i++) {
                aux = v[i];
                j = i;
                while (j >= gap && v[j - gap] > aux) {
                    v[j] = v[j - gap];
                    j = j - gap;
                }
                v[j] = aux;
                System.out.println(Arrays.toString(v)); // passo-a-passo
            }
            gap = gap / 2;
        }
    }
}
