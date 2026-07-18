public class RightAnglePy {
    public static void main(String[] args) {
        printPy('*', 5, 0);
        System.out.println();
    }

    public static void printPy(char c, int n, int i){
        if(i == n) return;

        for(int j = 0; j<=i ; j++){
            System.out.print(c);
        }
        System.out.println();

        printPy(c, n, i+1);
    }

    
}
