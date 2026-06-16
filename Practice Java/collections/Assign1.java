package collections ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(List.of(5, 3, 8, 1, 9, 2, 8, 3, 5));

        System.out.println("List : ");
        for(int i : arrList){
            System.out.print(i + " ");
        }


        Collections.sort(arrList);
        System.out.println();
        System.out.println("Sorted List : ");
        for(int i : arrList){
            System.out.print(i + " ");
        }
        for(int i = 1  ; i<arrList.size(); i++){
            if(arrList.get(i) == arrList.get(i-1)){
                arrList.remove(i);
            }
        }
        System.out.println();
        System.out.println("List without Duplicates : ");

        for(int i : arrList){
            System.out.print(i + " ");
        }

        
    }
}
