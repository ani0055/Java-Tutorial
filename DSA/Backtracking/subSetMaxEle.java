package DSA.Backtracking;

import java.util.ArrayList;

public class subSetMaxEle {
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
