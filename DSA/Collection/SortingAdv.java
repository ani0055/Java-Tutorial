package DSA.Collection;
import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    //Find what is "that" keyword
    public int compareTo(Student that){
         if(this.age > that.age)
            return 1;
         else 
            return -1;
    }
    
}
public class SortingAdv{
    public static void main(String[] args) {

        Comparator<Student> com = (S1, S2) ->  S1.age>S2.age?1:-1; // Comparator using Lambda Operator

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(21, "Animesh"));
        studs.add(new Student(19, "Ramesh"));
        studs.add(new Student(17, "Meena"));
        studs.add(new Student(24, "Shrushti"));
        studs.add(new Student(21, "Vartika"));
        
        // By default the studs can't be compared. Integers can be compared because they implements the comparable interface wqhich has a compareTo() method which tells the compiler that what to compare to 

        Collections.sort(studs); // Comparator Sorts the Students in assending order of age
        for(Student n : studs){
            System.out.println(n);
        }
    }
}