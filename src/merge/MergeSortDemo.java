package merge;

public class MergeSortDemo {
    int[] arr = {4, 5, 7, 32, 6, 7, 6, 45, 2, 34, 22, 13, 45, 53};

    void sort(int[] a, int head, int tail) {
        if (head < tail) {
            int mid = (head + tail) / 2;
            sort(a, head, mid);
            sort(a, mid + 1, tail);
            merge(a, head, mid, tail);
        }
    }

    private void merge(int[] a, int head, int mid, int tail) {
        int[] left = new int[mid - head + 1];
        int[] right = new int[tail - mid];
        for (int n = 0; n < left.length; n++) {
            left[n] = a[n+head];
            //System.out.print("left " + left[n]+"  ok?   ");
        }
        for(int n = 0; n<right.length;n++){
            right[n]=a[n+mid+1];
        }

        int i = 0, j = 0, k = head;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }

    public MergeSortDemo() {
        sort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }

    public static void main(String[] args) {
        new MergeSortDemo();
    }
}
