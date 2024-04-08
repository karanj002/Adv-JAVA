package Sorting;

public class SelectionSort {
    void sort(int arr[]){
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            int first= i;
            for(int j=i+1; j<n; j++)
                if(arr[j]<arr[first])
                    first=j;
                int temp=arr[first];
                arr[first]=arr[i];
                arr[i]=temp;
            }
        }
        void printArray(int arr[]){
        int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

    public static void main(String[] args) {
        SelectionSort ss= new SelectionSort();
        int arr[]= {23, 222, 45, 56, 12, 69};
        ss.sort(arr);
        System.out.println("Sorted array: ");
        ss.printArray(arr);
    }
}
