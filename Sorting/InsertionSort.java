package Sorting;

public class InsertionSort {
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int k= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1]= arr[j];
                j=j-1;
            }
            arr[j+1]=k;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 34, 121, 51, 89, 23 };
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        is.printArray(arr);
    }
}

