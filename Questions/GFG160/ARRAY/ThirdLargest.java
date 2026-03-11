public class ThirdLargest {
    int thirdLargest(int arr[]) {
        // Your code here
        Integer first = null , second = null , third = null;
        
        if(arr.length<3) return -1;
        
        for(int num : arr){
            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
            }
            else if(second == null || num > second){
                third = second;
                second = num;
            }
            else if(third == null || num>third) third = num;
        }
        return third != 0 ? third:-1;
    }
}
