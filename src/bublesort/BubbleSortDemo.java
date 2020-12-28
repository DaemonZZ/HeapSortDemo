package bublesort;

public class BubbleSortDemo {
    int[] a = {4, 5, 7, 32, 6, 7, 6, 45, 2, 34, 22, 13, 45, 53};

    public BubbleSortDemo() {
        sort(a, a.length);
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void sort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) swap(a, i, i + 1);
        }
        if (n > 2) sort(a, n - 1);
    }

    public static void main(String[] args) {
        new BubbleSortDemo();
    }
}
