// Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
// Example :
 

// Input : A = {1, 2, 3, 4, 5}
// Output : [48]
//          [20, 28] 
//          [8, 12, 16] 
//          [3, 5, 7, 9] 
//          [1, 2, 3, 4, 5] 

import java.util.Arrays;

public class SumFromTriangle {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        sumArray(arr);

    }

    public static void sumArray(int[] arr){
        
        if(arr.length < 1) return ;
        int[] newArr = new int[arr.length-1];
        for(int i = 0 ; i<arr.length-1; i++){
            newArr[i] = arr[i]+arr[i+1];
        }

        sumArray(newArr);
        
        System.out.println(Arrays.toString(arr));;
    }
}
