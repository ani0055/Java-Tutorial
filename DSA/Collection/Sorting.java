package DSA.Collection;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else 
                    return -1;

            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(58);
        nums.add(27);
        nums.add(92);
        nums.add(64);
        nums.add(12);
        nums.add(11);
        nums.add(102);

        // we can use our logic in the the Collection.sort() for sorting using the object of the comparator which is an interface 
        //Here we will be sorting on the values of units place 
        Collections.sort(nums,com);
        // Collections.sort(nums); //Co0llections class has various methods for operations
        System.out.println(nums);
        // Note Collections works with the wrapper Classes
    }
}
