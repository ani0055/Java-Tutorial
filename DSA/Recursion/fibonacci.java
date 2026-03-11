package DSA.Recursion;

public class fibonacci {
    public static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-2)+fib(n-1);
    }


    public static void main(String[] args) {
        int n = 8;

        System.out.println("The fibonacci no. at " + n + " is " + fib(n));

        for(int i = 0; i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
