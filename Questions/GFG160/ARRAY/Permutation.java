// The change starts from the decreasing point from the end
//step 1 find the changing point
//step 2 swap the changing point with the next highest number 
// after that rearrange the remaining array in an sorted order(array after the swapped digit)

public class Permutation {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int i = n-2;
        
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        
        if(i >= 0){
            int j = n-1;
            
            while(j>=0 && arr[j] <= arr[i]){
                j--;
            }
            
            swap(arr,i,j);
        }
        
        reverse(arr,i+1);
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
