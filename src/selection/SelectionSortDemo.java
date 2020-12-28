package selection;

public class SelectionSortDemo {
    int[] a = {4, 5, 7, 32, 6, 7, 6, 45, 2, 34, 22, 13, 45, 53};
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public SelectionSortDemo(){
        sort(a, 0);
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }
    void sort(int[] a, int index){
        int min = a[index];
        for(int i = index+1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                swap(a,index,i);

            }
        }
        if(index<a.length-1) sort(a,index+1);
    }

    public static void main(String[] args) {
        new SelectionSortDemo();
    }
}
