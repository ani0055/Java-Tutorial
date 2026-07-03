
public class SumOfDigits {
    public static void main(String[] args) {
        int an = sumOD(123456789);
        System.out.println(an);
    }

    public static int sumOD(int n){
        if(n==0) return 0;
        int d = n%10;
        return d+sumOD(n/10);
    }
}
