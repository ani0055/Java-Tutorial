package DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {26,88,91,66,71,31,96,57,14};
        System.out.println("Array before Sorting : ");
        for(int num : arr) System.out.print(" " + num);
        System.out.println();
        sortR(arr,arr.length);
        System.out.println("Array afer Sorting : ");
        for(int num : arr) System.out.print(" " + num);
    }

    public static int[] Sort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j < arr.length-i;j++){
                if(arr[j-1] > arr[j] ){
                    swap(arr,j-1,j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sortR(int[] arr, int n){
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    sortR(arr, n - 1);
    }
}
