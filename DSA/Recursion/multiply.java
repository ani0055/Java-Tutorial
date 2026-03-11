package DSA.Recursion;

public class multiply {
    public static int mul(int m , int n){
        if(n == 1) return m;

        return m+mul(m,n-1);
    }

    public static void main(String[] args) {
        System.out.println(mul(17, 9));
    }
}
