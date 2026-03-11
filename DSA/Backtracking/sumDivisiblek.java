package DSA.Backtracking;
import java.util.*;

public class sumDivisiblek {
    // Subset where sum is divisible by k
    static void subsetDivisibleByK(int i, int n,int sum, ArrayList current){
        if(i>n){
            if(sum%3 == 0 && sum > 0){
                System.out.println(current);
            }
            return;
        }
        current.add(i);
        subsetDivisibleByK(i+1, n, sum+i, current);
        current.remove(current.size() - 1);
        subsetDivisibleByK(i+1, n, sum, current);
    }
    
    // subset with max element k
    static void subsetMaxEle(int i,int n,int maxi,ArrayList current){
        if(i > n){
            if(maxi <= 3){
                System.out.println(current);
            }
            return;
        }
        int originalMaxi = maxi;
        if(i>maxi) maxi = i;
        current.add(i);
        subsetMaxEle(i+1, n, maxi, current);
        current.remove(current.size() - 1);
        subsetMaxEle(i+1, n, originalMaxi, current);
    }
}
