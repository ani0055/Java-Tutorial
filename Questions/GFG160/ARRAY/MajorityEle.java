//You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 
//Note: The answer should be returned in an increasing format.

import java.util.ArrayList;
import java.util.Collections;

public class MajorityEle {
    public ArrayList<Integer> findMajority(int[] arr) {
        //herenotice that there can be maximum two candidates which will have votes > n/3
        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;
        int n = arr.length;
        
        for(int num:arr){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
            else if(count1 == 0 ){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        
        for(int num : arr){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }
        
        ArrayList<Integer> newArr = new ArrayList<>();
        if(count1 > n/3) newArr.add(candidate1);
        if(count2 > n/3) newArr.add(candidate2);
        
        Collections.sort(newArr);
        return newArr ; 
        
    }
}
