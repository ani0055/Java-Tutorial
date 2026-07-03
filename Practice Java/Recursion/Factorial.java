public class Factorial {
    public static void main(String[] args) {
        int an = fact(5);
        System.out.println(an);
    }

    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}
