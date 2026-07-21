import java.util.Arrays;

public class inPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,1,6,2,8};
        inPlace(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void inPlace(int[] arr, int start, int end){
        if(start >= end) return;

        int mid = start + (end-start)/2;

        inPlace(arr, start, mid);
        inPlace(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int s, int mid, int e){
        int[] merged = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= e){
            if(arr[i] < arr[j]){
                merged[k] = arr[i];
                i++;
            }else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            merged[k] = arr[i];
            i++;
            k++;
        }

        while(j <= e){
            merged[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0 ; l<merged.length ; l++){
            arr[s+l] = merged[l];
        }

    }
}
