package DSA.Recursion;

public class countingZeros {
    public static int count(int n, int c, int i){
        if(n<=0) return c;
        i = n%10;
        n = n/10;
        if(i == 0) c++;

        return count(n, c, i);
    }

    public static void main(String[] args) {
        System.out.println(count(1001001, 0, 0));
    }
}
