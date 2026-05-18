
//import java.util.Arrays;
public class Sort {

    // Algoritmos simples de Ordenação 
    // Bubble, Selection, Insertion e Shell
    public static void bubblesort(int[] v) {
        int n = v.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
                //System.out.println(Arrays.toString(v)); // passo-a-passo
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
                //System.out.println(Arrays.toString(v)); // passo-a-passo
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
            //System.out.println(Arrays.toString(v)); // passo-a-passo
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
                //System.out.println(Arrays.toString(v)); // passo-a-passo
            }
            gap = gap / 2;
        }
    }

    public static void shellsort2(int[] v) {
        int n = v.length;
        int gap = 1;

        while (gap < n) {
            gap = gap * 3 + 1;
        }

        gap = gap / 3;
        int aux, j;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                aux = v[i];
                j = i;
                while (j >= gap && v[j - gap] > aux) {
                    v[j] = v[j - gap];
                    j = j - gap;
                }
                v[j] = aux;
                //System.out.println(Arrays.toString(v)); // passo-a-passo      
            }
            gap = gap / 2;
        }
    }

    // Algoritmos de Divisão e Conquista para Ordenação
    // Merge e Quick
    public static void mergesort(int[] v) {
        if (v == null || v.length < 2) {
            return;
        }
        int mid = v.length / 2;
        int[] left = new int[mid];
        int[] right = new int[v.length - mid];

        System.arraycopy(v, 0, left, 0, mid);
        System.arraycopy(v, mid, right, 0, v.length - mid);

        mergesort(left);
        mergesort(right);
        merge(v, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void quicksort(int[] v, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(v, low, high);
        quicksort(v, low, pivotIndex - 1);
        quicksort(v, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
