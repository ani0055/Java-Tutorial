package DSA.Recursion;

// function calling itself is called recursion

// 2 approaches are bottom up(eg: 1+2+3+4) approach and top down(eg: 5+4+3+2+1) approach

// works is stack

// Disadvantage of recursion is that it uses alot of space


public class SumR {
    
    // Bottom up approach

    public static int sum(int i){
        if(i == 1) return 1;

        return i+sum(i-1);
    }

    //Top Down Approach
    public static int sum(int i, int n){
        if(i == n) return i;

        return n+sum(i,n-1);

    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println("Sum of "+ n + " is " + sum(n));

        System.out.println("Sum of "+ n + " is " + sum(1,n));


    }
}
