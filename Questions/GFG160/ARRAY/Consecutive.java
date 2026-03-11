//Given an array arr[] consisting of only 0’s and 1’s, 
//return count of a maximum number of consecutive 1’s or 0’s present in the array. 

public class Consecutive {
    public int maxConsecBits(int[] arr) {
        // code here
        int count = 1, maxCount = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] == arr[i]) count++;
            else{
                    count = 1;
                } 
            if(maxCount < count) maxCount = count;
        }
        
        return maxCount;
    }
}
