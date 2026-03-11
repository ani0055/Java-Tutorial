package DSA.Recursion;

public class toPower {
    public static int ans(int n, int pow){
        if(pow == 0) return 1;
        return n*ans(n,pow-1);
    }

    public static void main(String[] args) {
        System.out.println(ans(2,5));
    }
}
