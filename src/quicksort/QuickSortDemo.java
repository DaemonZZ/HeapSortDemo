package quicksort;

public class QuickSortDemo {
    int[] a = {13, 5, 7, 32, 77, 345, 6, 45, 2, 34, 22, 4, 11, 53};
    public QuickSortDemo(){
        sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void sort(int[] a, int head, int tail){
        if(head<tail){
            int pivot = div(a,head,tail);
            sort(a,head,pivot-1);
            sort(a,pivot+1,tail);

        }
    }

     int div(int[] a, int head, int tail) {
        int pivot = head;
        int l = head, r = tail;
        while (l<r){
            if(pivot==l){
                if(a[r]<a[pivot]){
                    swap(a,r,pivot);
                    pivot=r;
                }
                else {
                    r--;
                }
            }
            if(pivot==r){
                if(a[l]>a[pivot]){
                    swap(a,l,pivot);
                    pivot=l;
                }else {
                    l++;
                }
            }
        }
        return pivot;
    }



    public static void main(String[] args) {
        new QuickSortDemo();
    }
}
