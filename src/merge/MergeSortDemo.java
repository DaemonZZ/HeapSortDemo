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
        int i = 0, j = 0;
        int[] left = new int[mid-head+1];
        int[] right = new int[tail-mid];
        //System.out.print(left.length + "    "+ right.length+"    ");
        for (int n = 0; n < mid; n++) {
            left[n]=a[n];
            if(n+mid+1<a.length-1){
                right[n] = a[n+mid+1];
            }
        }
        for (int k = head; i<left.length-1 && j<right.length-1; k++) {
            if (left[i]<=right[j]) {
                a[k] = left[i];
                i++;
            } else{
                a[k]=right[j];
                j++;
            }

        }
    }
    public MergeSortDemo(){
        sort(arr,0,arr.length-1);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }

    public static void main(String[] args) {
        new MergeSortDemo();
    }
}
