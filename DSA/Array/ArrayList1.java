import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the number elements in the arraylist : ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 0; i < n ; i++){
            System.out.println("Enter the element at : "+i);
            arr.add(sc.nextInt());
        }

        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
