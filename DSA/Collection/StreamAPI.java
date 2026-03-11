package DSA.Collection;
import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(25,36,49,15,24,16,20);

        // Stream<Integer> s1 = nums.stream(); //Whatever you do the stream it will not affect the values of nums
                                            //Stream can only be used once and not multiple times
        // s1.forEach(n->System.out.println(n));// A good replacement for the enhanced for loop

        // Stream<Integer> s2 = s1.filter(n->n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2); //Mainly the stream methods provide with a new Stream
        // int Result = s3.reduce(0, (c,e)->c+e); //reduce give an value of the data type
        // System.out.println(Result);

        // s3.forEach(n->System.out.println(n));

        int result = nums.stream()
                         .filter(n->n%2==0) // needs object of a predicate(It is a functional interface) and since we are using only one parameter we need not to define it
                                            // for running multiple threads you can use nums.parallelStream method (avoid using for sorting)
                         .map(n->n*2) //
                         .reduce(0,(c,e)->c+e); // c is a carry and e is element identity is the initial value 
        System.out.println(result);

        
    }
}
