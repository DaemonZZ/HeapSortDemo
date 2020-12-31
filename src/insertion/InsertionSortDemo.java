package insertion;

public class InsertionSortDemo {
    int[] a = {4, 5, 7, 32, 6, 7, 6, 45, 2, 34, 22, 13, 45, 53};
    void sort(int[] a, int index) {
        if (index < a.length) {
            int cur = a[index];
            for (int i = index -1; i >= 0; i--) {
                if (cur < a[i]) {
                    a[i + 1] = a[i];
                    a[i] = cur;
                } else {
                    a[i + 1] = cur;
                    break;
                }
            }
            sort(a, index + 1);
        }

    }

    public InsertionSortDemo() {
        sort(a, 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }

    public static void main(String[] args) {
        new InsertionSortDemo();
    }
}
