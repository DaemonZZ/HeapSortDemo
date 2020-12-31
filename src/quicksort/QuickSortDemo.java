package quicksort;

public class QuickSortDemo {
    int[] a = {4, 5, 7, 32, 6, 7, 6, 45, 2, 34, 22, 13, 45, 53};
    public QuickSortDemo(){

        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void sort(int[] a, int head, int tail){
        int pivot = div(a,head,tail);
        sort(a,head,pivot);
        sort(a,pivot+1,tail);
    }

     int div(int[] a, int head, int tail) {
        int pivot = head;
        int comp = a[pivot];
        while (head<tail){

        }
    }

    public static void main(String[] args) {
        new QuickSortDemo();
    }
}
