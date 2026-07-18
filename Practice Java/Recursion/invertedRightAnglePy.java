public class invertedRightAnglePy{
    public static void main(String[] args) {
        printPy('*', 5);
    }
    public static void printPy(char c, int n){
        if(n == 0) return;
        for(int i = 0 ; i<n ; i++){
            System.out.print(c);
        }
        System.out.println();
        printPy(c, n-1);
    }
}
