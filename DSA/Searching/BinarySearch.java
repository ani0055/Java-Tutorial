package DSA.Searching;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,25,21,36,24,27,38,45,12,31};
        Arrays.sort(arr);
        for(int num : arr) System.out.print(" "+num);
        System.out.println();
        System.out.println(search(arr,28));  

    }

    public static int search(int[] arr, int t){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(t == arr[mid]) return mid;
        
            else if(t < arr[mid]) e = mid - 1 ;

            else if(t>arr[mid]) s = mid + 1 ;
            
        }

        return -1;
    }
}
