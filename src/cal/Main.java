package cal;

import java.util.ArrayList;

public class Main {
    static int steps_count = 0;
    int[] a = {5,8,9,6,4,7,6,3,45,34,234,1234,1,234};

    public Main() {
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    void buildHeap(int[] a,int i,int size){
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<size && a[left]>a[max]){
            max = left;
        }
        if(right<size && a[right]>a[max]){
            max=right;
        }
        if(max != i){
            swap(a,i,max);
            buildHeap(a,max,size);
        }
    }

    void sort(int[] a){
        for(int i = a.length/2-1;i>=0;i--){
            buildHeap(a,i,a.length);
        }
        for(int i = a.length-1;i>0;i--){
            swap(a,i,0);
            buildHeap(a,0,i);
        }
    }

    private void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        new Main();
    }
}
