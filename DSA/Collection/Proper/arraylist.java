package DSA.Collection.Proper;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        Integer a[] = {15,24,56,89};
        List l = Arrays.asList(a); // fastest way to convert array to list
        System.err.println(l);
        x.add(5);
        x.add(10);
        x.add(15);
        x.add(20);
        x.add(25);

        System.out.println(x.get(2));
        System.out.println(x.hashCode());
        for(Integer i : x){
            System.out.println(i);
        } 
    }   
}
