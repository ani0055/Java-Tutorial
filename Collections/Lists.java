package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        List<Integer> List = new ArrayList<>();

        System.out.println("Enter the no. of elements in array : ");
        int n = sc.nextInt();

        for(int i = 0; i<n ; i++){
            List.add(sc.nextInt());
        }

        for(int i : List){
            System.out.print(i);
        }
        sc.close();
    }

}
