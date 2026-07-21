import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,1,6,2,8};

        int[] newArr = divide(arr);

        System.out.println(Arrays.toString(newArr));
    }

    public static int[] divide(int[] arr){
        if (arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    public static int[] merge(int[] first, int[] second){
        int[] merged = new int[first.length+second.length];

        int i = 0; 
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
                
            }
            else{
                merged[k] = second[j];
                j++;
                
            }
            k++;
        }

        while(i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }

        return merged;
    }
}
