public class SecondLargest{
     public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2) return -1;
        
        int largest = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > largest){
                Second = largest;
                largest = num;
            }
            else if(num < largest && num > Second){
                Second = num;
            }
            
        }
        
        return (Second == Integer.MIN_VALUE) ? -1 : Second;
    }
}