@FunctionalInterface  // Works only with the functional interface
interface Ani {
    int Add(int i, int j);
}
public class functionalInterface2 {
       public static void main(String[] args) {
        Ani obj = ( i, j) -> i+j;
            
        System.out.println(obj.Add(5,7));
    }
}
