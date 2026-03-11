package DSA.Collection;
import java.util.*; //For thhe List

public class IntroCollection {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<Integer>();//We are usiong List here because we need the operate with the index and Collection doesn't operate with thje index
        // nums.add(5); // here we have not talked about the type of edata we store because in collectioon we store objects
        // nums.add(29); // that's why we use the <> brakets in which we write the wrapper class of the Integer
        // nums.add(75);// <> are called generics
        // nums.add(15);
        // nums.add(21);
        // nums.add(10);
        // System.out.println(nums.indexOf(15));//Gives Index of the value
        // System.out.println(nums.remove(2));//removes the object from the Index and outputs the value at the index

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(32);
        nums.add(54);
        nums.add(68);
        nums.add(12);
        nums.add(21);
        nums.add(32);
        //Set is a collection of unique values
        //Set will not give values in sorted format and doesn't have any index values 
        // Unlike HAshSet we can use TreeSet gives the sorted data

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        
       
        
        // for(int n: nums ){ //That's why we are getting this error since we can't store an object in int
        //     System.out.println(n);
        // }
    }
}
