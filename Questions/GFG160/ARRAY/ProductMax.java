//The hiring team aims to find 3 candidates who are great collectively. Each candidate has his or her ability expressed as an integer. 
//3 candidates are great collectively if the product of their abilities is maximum. Given the abilities of some candidates in an array, arr[], 
//return the maximum collective ability from the pool of candidates.

public class ProductMax {
    int maxProduct(int[] arr) {
        // code here
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for(int num : arr){
            if(num>max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num>max2){
                max3 = max2;
                max2 = num;
            }
            else if(num>max3) max3 = num;
            
            if(num<min1){
                min2 = min1;
                min1 = num;
            }
            else if(num<min2) min2 = num;
        }
        
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
